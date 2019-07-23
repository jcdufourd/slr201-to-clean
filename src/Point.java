import java.util.ArrayList;

public class Point {
    public static void main(String args[]) {
        Point p = new Point(26F, 6F);
        p.print();
        System.out.println();
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point other) {
        return this.x == other.x && this.y == other.y;
    }


    private int x = 3;
    private int y = 7;

    public Point() {
    }

    public Point(float rho, float theta) {
        x = (int) (rho * Math.cos(theta));
        y = (int) (rho * Math.sin(theta));
    }

    public Point pointFactory(int x, int y) {
        Point p = new Point();
        p.y = x;
        {
            float rho = 3;
            p.x = y;
        }
        return p;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void writeCoordinates() {
        System.out.println("x=" + x);
        return;
    }

    public void shift(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public void print() {
        System.out.print(this.x+" "+this.y);
    }

    public int getY() {
        return y;
    }
}

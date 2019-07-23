public class Square extends Point {
    private int width = 0;

    public Square(int x, int y, int width) {
        super(x, y);
        this.width = width;
    }
    public Square(float rho, float theta, int width) {
        super(rho, theta);
        this.width = width;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" "+width);
    }

    public static void main(String args[]) {
        Square s = new Square(100, 200, 300);
        s.print();
        System.out.println();
    }
}

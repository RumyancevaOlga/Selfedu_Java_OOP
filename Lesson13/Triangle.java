public class Triangle {
    Point first, second, third;

    {
        first = new Point(0, 0);
        second = new Point(0, 10);
        third = new Point(10, 0);
    }

    public Triangle() {
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        first = new Point(x1, y1);
        second = new Point(x2, y2);
        third = new Point(x3, y3);
    }
}

public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect();
        Rect rect2 = new Rect(1, 11, 21, 1);
        Rect rect3 = new Rect(2, 22, 20f, 10f);

        System.out.println("x1 = " + rect1.x1 + " y1 = " + rect1.y1 + " x2 = " + rect1.x2 + " y2 = " + rect1.y2);
        System.out.println("x1 = " + rect2.x1 + " y1 = " + rect2.y1 + " x2 = " + rect2.x2 + " y2 = " + rect2.y2);
        System.out.println("x1 = " + rect3.x1 + " y1 = " + rect3.y1 + " x2 = " + rect3.x2 + " y2 = " + rect3.y2 + "\n");

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(1, 1, 1, 11, 21, 1);

        System.out.println("x1 = " + triangle1.first.x + " y1 = " + triangle1.first.y + " x2 = " + triangle1.second.x + " y2 = " + triangle1.second.y + " x3 = " + triangle1.third.x + " y3 = " + triangle1.third.y);
        System.out.println("x1 = " + triangle2.first.x + " y1 = " + triangle2.first.y + " x2 = " + triangle2.second.x + " y2 = " + triangle2.second.y + " x3 = " + triangle2.third.x + " y3 = " + triangle2.third.y);

        Line line1 = new Line();
        Line line2 = new Line();

        line1.x1 = 2;
        line1.y1 = 2;
        line1.x2 = 7;
        line1.y2 = 3;

        line2.x1 = 4;
        line2.y1 = 1;
        line2.x2 = 5;
        line2.y2 = 6;

        Double a1 = (line1.y1 - line1.y2) / (line1.x1 - line1.x2);
        Double a2 = (line2.y1 - line2.y2) / (line2.x1 - line2.x2);
        Double b1 = line1.y1 - a1 * line1.x1;
        Double b2 = line2.y1 - a2 * line2.x1;

        Double xa = (b2 - b1) / (a1 - a2);
        Double ya = a1 * xa + b1;

        System.out.println(xa + ", " + ya);

    }
    
}

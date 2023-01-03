public class Main {
    public static void main(String[] args) {
        Point3D first = new Point3D();
        Point3D second = new Point3D();
        Point3D third = new Point3D();

        first.x = 1;
        first.y = 2;
        first.z = 3;

        second.x = 4;
        second.y = 5;
        second.z = 6;

        third.x = 7;
        third.y = 8;
        third.z = 9;

        System.out.printf("%d %d %d\n", first.x, first.y, first.z);
        System.out.printf("%d %d %d\n", second.x, second.y, second.z);
        System.out.printf("%d %d %d\n", third.x, third.y, third.z);

        Line line1 = new Line();
        Line line2 = new Line();

        line1.x1 = 0;
        line1.y1 = 0;
        line1.x2 = 5;
        line1.y2 = 2;

        line2.x1 = 0;
        line2.y1 = 2;
        line2.x2 = 10;
        line2.y2 = 0;

        System.out.printf("Координаты начала: (%d, %d) Координаты конца: (%d, %d)\n", line1.x1, line1.y1, line1.x2,
                line1.y2);
        System.out.printf("Координаты начала: (%d, %d) Координаты конца: (%d, %d)\n", line2.x1, line2.y1, line2.x2,
                line2.y2);
    }

}

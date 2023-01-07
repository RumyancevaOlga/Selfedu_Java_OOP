public class Main {
    public static void main(String[] args) {
        Person first = new Person();
        first.setAgeWeigth(33, 65);
        first.setCategory(2);
        first.setFio("Ivanov Ivan Ivanjvich");

        System.out.println("ФИО: " + first.getFio() + " возраст: " + first.getAge() + " вес: " + first.getWeight()
                + " разряд: " + first.getCategory());

        first.setAgeWeigth(20, 200);
        first.setCategory(6);
        first.setFio("Ivanov123 Ivan Ivanjvich");

        System.out.println("ФИО: " + first.getFio() + " возраст: " + first.getAge() + " вес: " + first.getWeight()
                + " разряд: " + first.getCategory());

        Person second = new Person("Ivanov123 Ivan Ivanjvich", 20, 200, 6);

        System.out.println("ФИО: " + second.getFio() + " возраст: " + second.getAge() + " вес: " + second.getWeight()
                + " разряд: " + second.getCategory());

        Vec2 v1 = new Vec2();
        v1.setA(10);
        v1.setB(-10);

        System.out.println("a = " + v1.getA() + " b = " + v1.getB());

        v1.setA(100);
        v1.setB(-100);

        System.out.println("a = " + v1.getA() + " b = " + v1.getB());

        Vec2 v2 = new Vec2(100, -100);

        System.out.println("a = " + v2.getA() + " b = " + v2.getB());

        v2.setA(20);
        v2.setB(-20);

        System.out.println("a = " + v2.getA() + " b = " + v2.getB());

        Vec2 sum = v1.sum(v2);
        System.out.println("a = " + sum.getA() + " b = " + sum.getB());

        Vec2 sub = v1.sub(v2);
        System.out.println("a = " + sub.getA() + " b = " + sub.getB());

        Lib lib = new Lib();
        Book book = new Book();
        book.setTitle("War and peace");
        book.setAuthor("Lev Tolstoy");
        book.setPublication(2021);
        book.setPages(800);

        lib.addLib(book);
        lib.printLib();
    }

}

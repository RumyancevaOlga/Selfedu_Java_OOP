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
    }

}

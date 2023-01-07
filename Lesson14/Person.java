public class Person {
    private String fio;
    private int age;
    private int weight;
    private int category;
    private static final int MAX_NUMBER = 200;

    public Person() {
    }

    public Person(String fio, int age, int weight, int category) {
        Person p = new Person();
        p.setFio(fio);
        p.setAgeWeigth(age, weight);
        p.setCategory(category);
    }

    private boolean isCorrect(int arg) {
        return (30 <= arg && arg <= MAX_NUMBER);
    }

    public void setAgeWeigth(int age, int weight) {
        if (isCorrect(age) && isCorrect(weight)) {
            this.age = age;
            this.weight = weight;
        }
    }

    public void setCategory(int category) {
        if (1 <= category && category <= 5) {
            this.category = category;
        }
    }

    public void setFio(String fio) {
        int count = 0;
        for (int i = 0; i < fio.length(); i++) {
            if (!((fio.charAt(i) >= 'a' && fio.charAt(i) <= 'z') || (fio.charAt(i) >= 'A' && fio.charAt(i) <= 'Z')
                    || fio.charAt(i) == ' ' || fio.charAt(i) == '-')) {
                count++;
            }
        }
        if (count == 0) {
            this.fio = fio;
        }
    }

    public String getFio() {
        return this.fio;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    public int getCategory() {
        return this.category;
    }

}

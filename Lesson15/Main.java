public class Main {
    public static void main(String[] args) {
        TV newTV = new TV("LG", 32, 2022, 70000);
        System.out.println("brand = " + newTV.getBrand() + " daigonal = " + newTV.getDiagonal()
                + " date of production = " + newTV.getDateOfProduction() + " price = " + newTV.getPrice());
    }

}

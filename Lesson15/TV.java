public class TV {
    private String brand;
    private int diagonal;
    private int dateOfProduction;
    private int price;

    private TV() {
        this.brand = "LG";
        this.diagonal = 32;
        this.dateOfProduction = 2022;
        this.price = 70000;
    }

    public TV(String brand, int diagonal, int dateOfProduction, int price) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.dateOfProduction = dateOfProduction;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

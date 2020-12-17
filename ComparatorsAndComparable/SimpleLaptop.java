// but if the class is not given or we are not able to edit it so to sort objects we have
// to use comparator in the main:

package ComparatorsAndComparable;

public class SimpleLaptop {
    private String brand;
    private int ram;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SimpleLaptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
    }

    public SimpleLaptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    
}

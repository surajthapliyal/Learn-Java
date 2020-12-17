// if the class is already given so we can make it Comparable by ourself:

package ComparatorsAndComparable;
//                               type name-->|
//                                           |
public class ComparableLaptop implements Comparable<ComparableLaptop>{
    private String brand;
    private int ram;
    private int price;

    public ComparableLaptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

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
        return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
    }

    @Override
    public int compareTo(ComparableLaptop o) {
        // FOR DESCENDING:              // FOR ASCENDING:
        // +ve if current is small      // -ve if current is small
        // -ve if current is large      // +ve if current is large
        // 0 if equal                   // 0 if equal

        // sorting on the basis of ram:
        // return this.ram - o.ram;
        
        // sorting on the basis of price:
        // return this.price - o.price; 

        // sorting on the basis of brand:
        // return this.brand.compareTo(o.brand);// here this compareTo is string's method not recursion.


        // sorting on basis- if both price is same then sort with name:
        if(this.price > o.price) return 1;
        else if(this.price < o.price) return -1;

        return this.brand.compareTo(o.brand);
    }
    
}


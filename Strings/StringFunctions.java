package Strings;

public class StringFunctions {
    public static void main(String[] args) {
        
        String name = "SURAJ";
        String name2 = new String("SURAJ");

        System.out.println(name);
        System.out.println(name.charAt(3));  // return character at 3 in string.
        System.out.println(name.length());   // return length of string .
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        System.out.println(name.contains("RA"));

        System.out.println(name == name2);  //false, as one in pool area and another in heap area.
        System.out.println(name.equals(name2)); //true,as it checks the equality of value.
    
        System.out.println(name+name2);  //concat as string override.
        System.out.println(name.concat(" THAPLIYAL"));
        System.out.println(name.concat(name2));

        System.out.println(name.replace("A", "M")); //gives new updated string as strings are immutable.

        String cars = "Hyundai,Honda,Maruti,Ferarri,Lamborghini,Tata";
        String[] allCars = cars.split(",");
        for(String car: allCars)
        System.out.print(car +" ");

        System.out.println(name.indexOf("A"));

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        String name5 = "    SURAJ     ";
        System.out.println(name5.trim());

        System.out.println(name.toCharArray());
    }
}
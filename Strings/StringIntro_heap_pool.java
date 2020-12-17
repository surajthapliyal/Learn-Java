package Strings;

public class StringIntro_heap_pool {
    public static void main(String[] args) {
        String name = "SURAJ";
        String name2 = "SURAJ";
        String name3 = new String("SURAJ");
        System.out.println(name == name2);  //true , as both are made inside string pool area using same word or string.
        System.out.println(name == name3);  //false, as name3 is made in heap area and copied inside pool area too
        // so that if we ever make same string with this(new) method then it first checks if the string is present
        //inside the pool area ,if not present then it will make new string in heap , if present the it will use that
        //string copy present inside pool as cache memory.
        String name4 = "THAPLIYAL";
        System.out.println(name == name4); // false, as both are diff words, so they will acquire diff mem in pool.
    }
}
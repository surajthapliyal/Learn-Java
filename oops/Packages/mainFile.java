package oops.Packages;

import oops.Packages.Models.student;

public class mainFile {
    public static void main(String[] args) {
        student obj = new student("Suraj");
        String name = obj.getName();
        System.out.println(name);
    }
}
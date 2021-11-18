package com.company;

import java.sql.SQLOutput;
import java.util.Locale;

public class SClass {
    public static void main(String[] args) {
        String s= new String("Computer");
        System.out.println("String is"+s);
        s.concat("Dept");
        System.out.println("String concat is" s);
        System.out.println("Length is "+s.indexOf("p"));
        System.out.println("Uppercase is"+s.toLowerCase());
        System.out.println("Uppercase is"+s.toUpperCase());
    }
}

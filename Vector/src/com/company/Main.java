package com.company;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector <String> vec = new Vector<String>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");

        vec.addElement("Rat");
        vec.addElement("CHuha");
        vec.addElement("kutta");

        System.out.println("Elements are: " + vec);
    }
}

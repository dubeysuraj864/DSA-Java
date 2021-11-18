package com.company;
import java.util.Vector;

public class vector2 {
    public static void main(String[] args) {
        Vector <String> vec = new Vector<String> ();
        vec.add("Tiger");
        vec.add("Elephant");
        vec.add("Monkey");
        System.out.println("Size is:" + vec.size());
        System.out.println("Default capacity is:" + vec.capacity());
        System.out.println("Vector elements are:" + vec);

        if(vec.contains("Tiger")){
            System.out.println("Tiger is present at the index" + vec.indexOf("Tiger"));
        }
        else{
            System.out.println("Tiger is not present in the list");
        }
        System.out.println("the first animal of the vector is+" + vec.firstElement());

        System.out.println("the last animal of the vector is" + vec.lastElement());


    }
}

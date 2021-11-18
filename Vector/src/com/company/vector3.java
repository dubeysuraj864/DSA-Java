package com.company;
import java.util.Vector;

public class vector3 {
    public static void main(String[] args) {
        Vector <Integer> in = new Vector<>();
        in.add(100);
        in.add(200);
        in.add(300);
        in.add(400);
        in.add(500);
        in.add(600);
        in.add(700);

        System.out.println("all the numbers are: "+in);
        System.out.println("remove the first occurance at first : " + in.remove((Integer)200));
        System.out.println("value in vector: " + in);

        System.out.println("remove element at index 4: " +in.remove(4));
        System.out.println("New value list in vector:" +in);

        in.removeElementAt(6);
        System.out.println("after remove element from index 5 : " + in );

        System.out.println("Hash code of this vector: "+ in.hashCode());
        System.out.println("element at index 1 is : " +in.get(1));


    }
}

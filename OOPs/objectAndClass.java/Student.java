// import java.util.*;
// import java.util.jar.Attributes.Name;

// public class Student {
//     int  id;
//     String name;
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.println(s1.name);
//         System.out.println(s1.id);
//     }
// }


// public class Student{
//          int id = 65;
//          String name = "Suraj Dubey";
//     public static void main(String[] args) {
//         Student s1= new Student();
//         System.out.println(s1.id);
//         System.out.println(s1.name);
//     }
// }

// class Student{
//     int id = 65;
//     String name = "Suraj Dubey";
// }

// class testStudent{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.println(s1.id);
//         System.out.println(s1.name);
//     }
// }
// class Student{
//     int id = 65;
//     String name = "Suraj Dubey";
// }

// class testStudent{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.println(s1.id + " " + s1.name);
      
//     }
// }

// public class Student{
//         int id ;
//         String name;
// }

// class testStudent{
//     public static void main(String[] args) {
//         Student suraj = new Student();
//         Student rohan = new Student();

//         suraj.id= 65;
//         suraj.name = "Suraj Dubey";

//         rohan.id = 32;
//         rohan.name = "Shukla rohan";
//         System.out.println(suraj.id + " " + suraj.name);
//         System.out.println(rohan.id + " " + rohan.name);
//     }
// }


// public class Student{
//     int id ;
//     String name;

//     void insertValue(int i, String n){
//        id = i;
//        name = n;
//     }
//     void displayValue(){
//         System.out.println(id + " " + name);
//     }
// }

// class testStudent{
//     public static void main(String[] args) {

//         // Scanner scn = new Scanner (System.in);

//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.insertValue(65, "Suraj Dubey");
//         s2.insertValue(32, "Rohan Shukla");

//       s1.displayValue();
//       s2.displayValue();
//     }
// }

public class Student{
    int id;
    String name;
    int salary;

    void insertValue(int i, String n, int s){
        id = i;
        name = n;
        salary =s;

    }

    void printValue(){
        System.out.println(id + " " + name + " " + salary);
    }
}

class testStudent{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.insertValue(65, "Suraj Dubey", 900000);
        s2.insertValue(32, "Rohan Shukla", 134423);
        s3.insertValue(69, "Charlie puth", 234234);

        s2.printValue();
        s1.printValue();
        s3.printValue();

    }
}


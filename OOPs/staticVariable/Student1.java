public class Student1 {
    int rollNo;
    String name;

    static String College = "AIT";

    Student1(int r, String n){
        rollNo = r;
        name = n;

    }

    void display(){System.out.println(rollNo + " " + name + " " + College);}

    public static void main(String[] args) {
        Student1 s1 = new Student1(111, "Suraj Dubey");
        Student1 s2 = new Student1(222, "Google");

        s1.display();
        s2.display();

    }
}


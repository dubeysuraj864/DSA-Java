public class Student {
    static int rollNo;
    String name;
    static String college = "AIT";

    static void change(){
        college = "IITD";
 
    }

    Student(int r, String n){
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println(rollNo + " " + name + " "+college );
    }
            public static void main(String[] args) {
                ThisStudent s1 =new ThisStudent(111, "Suraj dubey", rollNo);
                ThisStudent s2 =new ThisStudent(222, "Charlie", rollNo);

                ThisStudent.change();
                s1.display();
               
                s2.display();
            }
}

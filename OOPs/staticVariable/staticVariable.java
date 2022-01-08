class staticVariable {
    int rollNo;
    String name;
    String college= "ITS";

    staticVariable(int r, String n){
        rollNo= r;
        name = n;
    }
    void display(){
        System.out.println(rollNo+ " " + name + " " + college);
    }
    
public class Student{
    public static void main(String[] args) {
        staticVariable s1 = new staticVariable(111, "Suraj Dubey");
        staticVariable s2 = new staticVariable(222, "Juras Yubed");

        s1.display();
        s2.display();
    }
}
}


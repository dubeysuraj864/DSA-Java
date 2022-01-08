 class ThisStudent {
    int rollNo;
    String name;
    float fee;

    ThisStudent(int rollNo, String name, float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;

    }
    void display(){
        System.out.println(rollNo + " " + name + " " + fee);
    }

    class TestThis{

        public static void main(String[] args) {
            Student s1 = new Student(111, "Suraj Dubey");
            Student s2 = new Student(222, "Ariana Grande");

            s1.display();
            s2.display();
        }
    }

    public static void change() {
    }
}

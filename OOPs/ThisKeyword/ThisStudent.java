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
            ThisStudent s1 = new ThisStudent(111, "Suraj Dubey",0);
            ThisStudent s2 = new ThisStudent(222, "Ariana Grande", 6000);

            s1.display();
            s2.display();
        }
    }

    public static void change() {
    }
}

class ThisConstructor{
    int rollNo;
    String name,course;
    float fee;

    ThisConstructor(int rollNo, String name, String course, float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.course= course;
        this.fee = fee;
    }
    void display(){
        System.out.println(rollNo + " "+ name +" "+ course +  " "+ fee);
    }
}

class Student{
    public static void main(String[] args) {
        ThisConstructor s1 = new ThisConstructor(111, "Suraj", "Java" , 0);
        ThisConstructor s2 = new ThisConstructor(222, "Selena", "Python", 2000);

        s1.display();
        s2.display();
    }
}
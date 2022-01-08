class ThisKeyword1{
    int rollNo;
    String name;
    float fee;

    ThisKeyword1(int r , String n , float f){

        rollNo = r;
        name = n;
        fee = f;
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + fee);
    }

    class TestThis3{
        public static void main(String[] args) {
            ThisKeyword1 s1 = new ThisKeyword1(111, "Suraj Dubey", 1000);
            ThisKeyword1 s2 = new ThisKeyword1(222, "Selena Gomez", 2000);

            s1.display();

            s2.display();       
         }
    }
}
abstract class bike2{
    bike2(){
        System.out.println("Bike is created!");
    }
    abstract void run();
    void changeGear(){
            System.out.println("gear changed");
    }
}

class honda extends bike2{
    void run(){
        System.out.println("Running awesome");
    }
}


class test{
    public static void main(String[] args) {
        bike2 obj;
        obj = new honda();
        obj.run();
        obj.changeGear();
    }
}

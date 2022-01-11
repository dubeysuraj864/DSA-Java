class Car {
    void run(){
        System.out.println("RUnning");
    }

}

class cruze extends Car{
    void run(){
        System.out.println("running safely at with 200km");
    }

    public static void main(String[] args) {
        Car c = new cruze(); //upcasting
        c.run();
    }
}

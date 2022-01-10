class vehicleOR {
    void run(){
        System.out.println("Vroom.... Vroom....");
    }    
}

class bike22 extends vehicleOR{
    void run(){
        System.out.println("Bike is running safey....");
    }

    public static void main(String[] args) {
        bike22 obj = new bike22();
        obj.run();
    }
}

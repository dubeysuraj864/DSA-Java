abstract class Bank {
    abstract int getROI();
}
class SBI extends Bank{
    int getROI(){
        return 7;
    }
}
class PNB extends Bank{
    int getROI(){
        return 8;
    }
}

class TestBank{
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI's rate of interest : "+ b.getROI());
        b= new PNB();
        System.out.println("PNB's rate of interest : "+ b.getROI());
    }
}

public class bankBank {
    float getROI(){
        return 0;
    }
}
class sbi extends bankBank{
    float getROI(){
        return 9;
    }
}
class icici extends sbi{
    float getROI(){
        return 10;
    }
}
class axis extends icici{
    float getROI(){
        return 8;
    }
}
class testPoly{
    public static void main(String[] args) {
        bankBank b;
        b = new sbi();
        System.out.println("SBI : "+b.getROI());
        b = new icici();
        System.out.println("ICICI : "+b.getROI());
        b = new axis();
        System.out.println("AXIS : "+b.getROI());
    }
}

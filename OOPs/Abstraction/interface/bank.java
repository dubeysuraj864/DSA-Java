interface bank {
    float ROI();
}
class SBI implements  bank{
    public float ROI(){
        return 5;
    }
}
class PNB implements bank{
    public float ROI(){
        return 9;
    }
}
class testInter{
    public static void main(String[] args) {
        bank b = new PNB();
      System.out.println(  b.ROI());
        bank b1 = new SBI();
      System.out.println(  b1.ROI());
    }
}

public class calculateRectArea {
    double length;
    double width;

    void rectArea(double l , double w){
        length= l;
        width= w;
    }
    void printArea(){
        System.out.println("The area of rectangle is : " + length * width);
    }

}
//area of rectangle
class testCalculation{
    public static void main(String[] args) {
        calculateRectArea a1 = new calculateRectArea();
        calculateRectArea a2 = new calculateRectArea();

        a1.rectArea(11, 5);
        a2.rectArea(3, 15);

        a1.printArea();
        a2.printArea();
    }
}


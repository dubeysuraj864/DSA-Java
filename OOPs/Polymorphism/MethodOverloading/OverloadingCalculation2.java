public class OverloadingCalculation2 {
    void sum(long a, long b){
        System.out.println("long arg method invoked");
    }
            // void sum(int a, int b){
            //     System.out.println("Int arg method invoked");
            // }
        


            public static void main(String[] args) {
                OverloadingCalculation2 obj = new OverloadingCalculation2();
            obj.sum(20000,20000);            }
}

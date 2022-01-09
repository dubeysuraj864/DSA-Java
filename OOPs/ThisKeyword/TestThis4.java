public class TestThis4 {
    void m(){
        System.out.println("Hello m");
    }
    void n(){
        System.out.println("Hello n");
        this.m();
    }
}

class test{
        public static void main(String[] args) {
            TestThis4 A = new TestThis4();
            A.n();
        }
}

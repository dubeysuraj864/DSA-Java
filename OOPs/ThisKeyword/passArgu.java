public class passArgu {
    void m(passArgu obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }

    public static void main(String[] args) {
        passArgu s1 = new passArgu();
        s1.p();
    }
}

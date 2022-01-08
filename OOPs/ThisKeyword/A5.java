public class A5 {
    void m(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        A5 obj = new A5();
        obj.m();
        System.out.println(obj);
    }
}

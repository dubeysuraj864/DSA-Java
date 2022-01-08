public class thisTest6 {
    thisTest6 getA(){
        return this;
    }
    void msg(){
        System.out.println("Hello Java");
    }
}


class test1{
    public static void main(String[] args) {
        new thisTest6().msg();    }
}

public class TestThis5 {

    TestThis5() {
        this(5);
        System.out.println("Hello");
    }

    TestThis5(int x) {
        System.out.println(x);
    }
}

class a {
    public static void main(String[] args) {
        new TestThis5();
    }
}

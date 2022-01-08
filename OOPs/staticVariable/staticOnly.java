public class staticOnly {
    static {
        System.out.println("Static is invoked");
    }
    public static void main(String[] args) {
        System.out.println("Hello Universe!");
    }
}

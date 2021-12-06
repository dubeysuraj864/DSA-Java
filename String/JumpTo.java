public class JumpTo {
    public static void main(String[] args) {
        String a = "Suraj";
        String b = "Suraj";
        String c = a;

        String name1 = new String("Suraj");
        String name2 =  new String ("Suraj");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}

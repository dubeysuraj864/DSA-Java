public class countDigits {
    public static void main(String[] args) {

        int num = 345345545;

        int i = 0;

        while (num != 0) {
            num /= 10;
            i++;
        }
        System.out.println(i);

    }
}

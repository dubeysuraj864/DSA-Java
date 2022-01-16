public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_no(1334534534);
        acc.setName("Suraj Dubey");
        acc.setEmail("dubeysuraj864@gmail.com");
        acc.setAmount(500000f);

        System.out.println(acc.getAcc_no()+" "+ acc.getName()+ " "+ acc.getEmail()+" "+ acc.getAmount());
    }
}

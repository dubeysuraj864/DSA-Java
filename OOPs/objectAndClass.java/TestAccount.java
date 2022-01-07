public class TestAccount {
    int acc_no;
    String name;
    float amount;

    void insert(int ano, String n, float a){
        acc_no = ano;
        name = n;
        amount = a;
    }
    void deposit(float a){
        amount = amount + a;
        System.out.println(a+ " deposited");
    }
    void withdraw(float a){
        if(amount < a){
            System.out.println("Insufficient Balance");
        }
        else{
            amount = amount - a;
            System.out.println(a + " withdraw");
        }
    }

    void checkBalance(){
        System.out.println("Balance is "+ amount);
    }
    void display(){
        System.out.println(acc_no + " " + name + " " +amount);
    }

    class Account{
        public static void main(String[] args) {
            TestAccount a1 = new TestAccount();
            a1.acc_no= 675667;
            a1.name = "Ankit";
            a1.amount= 1000;
            
            a1.display();
            a1.checkBalance();
            a1.deposit(a1.amount);
            
            a1.checkBalance();
            
            a1.withdraw(a1.amount);
            
            a1.checkBalance();

        }
    }
}

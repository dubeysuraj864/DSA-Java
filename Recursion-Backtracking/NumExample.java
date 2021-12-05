public class NumExample {
    public static void main(String[] args) {

        print(1);
        
    }
    static void print(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
    }
    
}

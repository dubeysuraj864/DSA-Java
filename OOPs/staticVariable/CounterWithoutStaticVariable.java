public class CounterWithoutStaticVariable{
    int count=0;
    CounterWithoutStaticVariable(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        
       new CounterWithoutStaticVariable();
       
    }
}

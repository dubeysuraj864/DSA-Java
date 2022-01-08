public class CounterWithoutStaticVariable{
    int count=0;
    CounterWithoutStaticVariable(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        
        CounterWithoutStaticVariable c1 = new CounterWithoutStaticVariable();
        CounterWithoutStaticVariable c2 = new CounterWithoutStaticVariable();
        CounterWithoutStaticVariable c3 = new CounterWithoutStaticVariable();
   
    }
}

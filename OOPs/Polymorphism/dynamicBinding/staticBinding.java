//when type of the object is determined at compile time (by the compiler), it is known as static binding.

//if there is any private, final or static method in class, there is static binding

public class staticBinding {
    private void eat(){
        System.out.println("dog is eating");
    }

    public static void main(String[] args) {
        staticBinding sb = new staticBinding();
        sb.eat();
    }
}

//static binding also known as early binding
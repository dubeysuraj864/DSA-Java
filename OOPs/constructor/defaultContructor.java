public class defaultContructor {
    int id; 
    String name;

    defaultContructor(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        new defaultContructor();
    }
}

// well default constructor is used to provide the default value to the object 
// like 0 and null in the above program.

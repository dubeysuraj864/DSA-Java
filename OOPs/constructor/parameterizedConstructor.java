public class parameterizedConstructor {
    int id ;
    String name;

    parameterizedConstructor(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
       parameterizedConstructor s1 = new parameterizedConstructor(65, "Suraj Dubey");
       parameterizedConstructor s2 = new parameterizedConstructor(77, "Yash Dubey");
       s1.display();
       s2.display();
    }

}

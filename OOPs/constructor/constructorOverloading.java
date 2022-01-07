public class constructorOverloading {
    int id;
    String name ;
    int age;

    constructorOverloading(int i, String n){
        id =i;
        name = n;


    }
    constructorOverloading(int i, String n, int a){
        id = i;
        name = n;
        age = a;

        
    }
    void display(){
        System.out.println(id + " " + name + " " + age);
    }
    public static void main(String[] args) {
        constructorOverloading s1 = new constructorOverloading(65, "Suraj dubey");
        constructorOverloading s2 = new constructorOverloading(58, "Samar Maurya", 99);

        s1.display();
        s2.display();
    }
}

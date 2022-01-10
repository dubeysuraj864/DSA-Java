class person{
    int id;
    String name;
    person(int id, String name){
            this.id = id;
            this.name = name;
    }
}

class Emp extends person{
    float salary;
    Emp(int id, String name , float salary ){
     super(id,name);
     this.salary= salary;   
    }

    void display(){
        System.out.println(id + " "+ name + " " + salary);
    }
}
public class realSuper {
    public static void main(String[] args) {
        Emp obj = new Emp(111, "Suraj Dubey", 234234);
        obj.display();
    }
}

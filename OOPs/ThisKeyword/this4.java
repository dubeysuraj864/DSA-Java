class B{
    this4 obj;
    B(this4 obj){
        this.obj=obj;
    }

    void display(){
        System.out.println(obj.data);
    }
}

public class this4 {
    int data =10;

    this4(){
        B b = new B(this);
        b.display();
    }

    public static void main(String[] args) {
    }
}


interface Printable{
    void print();
}
interface Showable{
    void print();
}

class multipleInh implements Printable, Showable {
    public void print(){System.out.println("hello");
}
    public static void main(String[] args) {
        multipleInh ml = new multipleInh();
        ml.print();
    }
    
}

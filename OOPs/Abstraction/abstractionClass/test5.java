interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){
        System.out.println("Im C");
    }
}

class M extends B{
    public void a(){System.out.println("Im a");}
    public void b(){System.out.println("Im b");}
    public void d(){System.out.println("Im c");}
}

class test5 {
        public static void main(String[] args) {
            A a = new M();
            a.a();
            a.b();
            a.c();
            a.d();
        }    
}

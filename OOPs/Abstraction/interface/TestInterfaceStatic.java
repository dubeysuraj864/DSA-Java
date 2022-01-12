interface drawableCb{
    void draw();
    static int cube(int x){return x*x*x;}
}

class rectangle9 implements drawableCb{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}


class TestInterfaceStatic {
    public static void main(String[] args) {
        drawableCb d5 = new rectangle9();
        d5.draw();
        System.out.println(drawableCb.cube(5));
    }
}

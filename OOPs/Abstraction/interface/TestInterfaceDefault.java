import javax.sound.sampled.SourceDataLine;

interface drawableIt{
    void draw();
    default void msg(){
        System.out.println("default method");
    }
}
class itsRectangle implements drawableIt{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}


class TestInterfaceDefault {
    public static void main(String[] args) {
        drawableIt d1 = new itsRectangle();
        d1.draw();
        d1.msg();
    }
}

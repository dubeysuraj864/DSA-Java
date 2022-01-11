interface A
{
 void disp();
}
interface B
{
void show();
}
class Test implements A, B
{
public void disp()
{
 System.out.println("A");
}
public void show()
{
 System.out.println("B");
}
public static void main(String ar[])
{
 Test t=new Test();
 t.disp();
 t.show();
 }
}
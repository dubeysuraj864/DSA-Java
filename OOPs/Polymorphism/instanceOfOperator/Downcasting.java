//  class Downcasting {
    
// }

// class dog3 extends Downcasting{
//     static void method(Downcasting a){
//         if(a instanceof dog3){
//             System.out.println("ok downcasting performed");
//         }
//     }
//     public static void main(String[] args) {
//         Downcasting a = new Downcasting();
//         dog3.method(a);
//     }
// }


class AnimalDown { }  
  
class Dog3 extends AnimalDown {  
  static void method(AnimalDown a) {  
    if(a instanceof Dog3){  
       Dog3 d=(Dog3)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
    AnimalDown a=new Dog3();  
    Dog3.method(a);  
  }  
    
 }  
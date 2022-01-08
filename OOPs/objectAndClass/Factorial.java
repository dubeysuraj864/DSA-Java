

// public class Factorial {

//     void fact(int n){
//         int fact=1;
//         for(int i=1; i<=n ; i++){
//             fact=fact*i;
//         }

//         System.out.println("fact is : "+ fact);
//     }
        
//         public static void main(String[] args) {
//             new Factorial().fact(5);
//         }
// }


class Factorial{
    int length;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;
        System.out.println(length * width);
    }
  
    public static void main(String[] args) {
        
        new Factorial().insert(3,6);

    }
}
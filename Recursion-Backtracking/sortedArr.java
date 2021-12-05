package RecursionArray;

import java.util.*;

public class sortedArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2, 6, 7, 8, 9 };
        System.out.println(check(arr, 0));
    }

    static boolean check(int[] arr,int index){
                if(index == arr.length-1){
                    return true;
                }
                else{
                    return arr[index] <arr[index+1] && check(arr, index +1);
                }
     }
}
 
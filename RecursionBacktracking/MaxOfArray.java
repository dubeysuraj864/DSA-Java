import java.util.Scanner;

public  class MaxOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn. nextInt();

        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= scn.nextInt();
        }
        int max = maxArray(arr, 0);
        System.out.println(max);
    }
    public static int maxArray(int [] arr, int idx){
        if(idx == arr.length -1){
            return arr[idx];
        }
        int misa = maxArray(arr, idx+1);
        if(misa > arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
    }
}

package RecursionArray;

public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {12,23,24,234,354,34};
        System.out.println(search(arr, 0, 254));
        
    }
    static int search(int[] arr, int index, int target){
        if(arr[index] == target){
            return index;
        }
        if(arr[index] != target){
            return -1;
        }
        else{
            return search(arr, index+1, target)  ;
        }
    }
}

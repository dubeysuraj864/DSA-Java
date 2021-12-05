#include<bits/stdc++.h>
using namespace std;
 
 void revArray(int arr[], int start , int end){
     while(start<end){
         int temp = arr[start];
         arr[start]= arr[end];
         arr[end]= temp;
         start++;
         end--;
     }
 }

 void printArray(int arr[], int size){
     for(int i=0 ; i<size ; i++){
         cout << arr[i] << " ";
     }
     cout << endl;
 }
 
int main()
{
        int n;
        cin >> n;
        int arr[n];
        for (int i=0 ; i<n ; i++){
            cin >> arr[i];
        }

        int length= sizeof(arr)/sizeof(arr[0]);

        printArray(arr, length);

        revArray(arr, 0, n-1);

        cout << "reverse array is-" << " ";

        printArray(arr, length);
        
      
 
      return 0;
}
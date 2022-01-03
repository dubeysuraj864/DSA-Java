#include<bits/stdc++.h>
using namespace std;
 
 int binarySearch(int arr[], int size, int element){
     int low, mid, high;
     low =0;
     high = size-1;

     //start searching
     while(low <= high){
     mid = (low + high)/2;

     if(arr[mid] == element){
         return mid;
     }
     if(arr[mid] < element ){
         low = mid+1;
     }
     else{
         high = mid-1;
     }
     }
     return -1;
 }
 
int main()
{
 
      int n;
      cin >> n;
      int arr[n];
      for(int i=0 ; i<n ; i++){
          cin >> arr[i];
      }
      int x;
      cin >> x;
    //   sort(arr, arr+n); 

      int index = binarySearch(arr, n, x);

  
          cout << "the element "<< x << " was found at index " << index;
      
 
      return 0;
}
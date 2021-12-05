#include<bits/stdc++.h>
using namespace std;
 

int deletion(int arr[], int size, int index){
        for(int i=index ; i< size-1 ; i++){
            arr[i] = arr[i+1];
        }

        for(int i=0 ; i<size-1 ; i++){
         cout << arr[i] << " ";
     }
     cout << endl;
        return -1;
}


int main()
{
 
     int n,index;
     cin >> n;
     int arr[n];
     for(int i=0 ; i<n ; i++){
         cin >> arr[i];
     }

    for(int i=0 ; i<n ; i++){
         cout << arr[i] << " ";
     }
     cout << endl;
    //  int size = sizeof(arr)/sizeof(arr[0]);

    deletion(arr,n , 3);

      return 0;
}
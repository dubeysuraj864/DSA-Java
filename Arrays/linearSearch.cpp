#include<bits/stdc++.h>
using namespace std;
 
 int linearSearch(int arr[], int size, int ele){
        for(int i=0 ; i<size ; i++){
            if(ele == arr[i]){
                cout << i;
                return i;
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
        cin >>x;

    linearSearch(arr, n,x);
 
      return 0;
}
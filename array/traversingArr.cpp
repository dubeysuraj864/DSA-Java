#include<bits/stdc++.h>
using namespace std;
 
 
 
int main()
{
    int n,i;
    cin >> n;
    int arr[n];

    // cout << "enter the elements of array: " ;
    for(i=0 ; i<n ; i++){
        cin >> arr[i];
    }

    for(int i=0 ; i<n ; i++){
        cout << arr[i] << " "<<&arr[i] << endl;
    }
 
      return 0;
}
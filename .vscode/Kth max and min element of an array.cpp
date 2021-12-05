// #include<bits/stdc++.h>
// using namespace std;
 
//  int kthSmallestNum(int arr[], int n , int k){
//      sort(arr, arr+n);
//      return arr[k-1];
//  }
 
// int main()
// {
 
//     int n;
//     cin >> n;
//     int k; cin >> k;
//     int arr[n];
//     for(int i=0 ; i<n ; i++){
//         cin >> arr[i];
//     }      

//     cout << "Kth Smallest element is " << kthSmallestNum(arr, n, k);
    
 
//       return 0;
// }

#include<bits/stdc++.h>
using namespace std;
 
 
 
int main()
{
 
      int arr[]= {12,23,45,67,78,56};
      int n= sizeof(arr)/sizeof(arr[0]);
      int k;
      cin >> k;

      set<int>s(arr, arr+n);
      set<int>::interator itr= s.begin();

      advance(itr, k-1);
      cout << *itr << "\n";

      System.current.timemillis();
 
      return 0;
}
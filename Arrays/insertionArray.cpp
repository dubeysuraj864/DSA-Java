#include<bits/stdc++.h>
using namespace std;
 
 
 
int main()
{
      int n;
      cin >> n;
      int arr[n];
      int item= 10, k=3;
      for(int i=0 ; i<n ; i++){
        cin >> arr[i];
      }

        int pos, ele;
        cin >> pos >> ele;

        if(pos > n){
          cout << "Invalid input" << " ";

        }
        else{
          for(int i= n-1; i >= pos ; i--){
                arr[i+1] = arr[i];
          }
          arr[pos-1] = ele;
        }

           cout << "after insertion" << " ";

           for (int i = 0; i <= n; i++)
           cout << arr[i] << " ";
           break;

      return 0;
}
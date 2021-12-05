#include<bits/stdc++.h>
using namespace std;
 
 
 
int main()
{
 
      int n;
      cin >> n;
      int arr[n];
      for(int i=1 ; i<=n ; i++){
          cin >> arr[i];
      }

      cout << " Array is : ";
        for(int i=1 ; i<=n ; i++){
          cout << arr[i] << " ";
      }
      cout << endl;


      int x;
      cout << "enter the element to find location: ";
      cin >> x;
      bool flag= false;
      for(int i=1 ; i<=n ; i++){

          if(arr[i] == x){
              cout << "the  location of "<< x << " is "<< i;
              flag= true;
              break;
              
          }

        //   else{
        //       cout << "element non-found"; 
        //   }
      }

      if(!flag){
          cout << "element not found";
      }
 
      return 0;
}
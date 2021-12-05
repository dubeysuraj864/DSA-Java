#include<bits/stdc++.h>
using namespace std;
 
 
 
int main()
{
 
      int m, n , sum=0;
      int a[3][4], b[4][2], result[3][2];
      cout << "enter the first matrix : "<< endl;

      for(int i=0 ; i< 3;i++ ){
          for(int j=0 ; j<4 ; j++){
              cout << "enter the element of first matrix"<< endl;
              cin >> a[i][j];
          }
          cout << endl;
      }

      cout << "enter the second matrix : "<< endl;

      for(int i=0 ; i< 3;i++ ){
          for(int j=0 ; j<4 ; j++){
              cout << "enter the element of second matrix"<< endl;
              cin >> a[i][j];
          }
          cout << endl;
      }

        for(int i=0 ; i<3  ; i++){
            for(int j=0 ; j<2 ; j++){
                //cal
                for(int k=0 ; k<4 ; k++)
                {
                    sum += a[i][k] * a[k][j];
        }
            result[i][j]= sum;
            sum =0;
                }
        }

            for (int i=0 ; i<3 ; i++){
                for(int j=0 ; j<2 ; j++){
                    cout << result[i][j] << endl;
                }
                cout << endl;
            }

      return 0;
}
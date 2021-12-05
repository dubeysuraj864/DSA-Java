// // // // #include<bits/stdc++.h>
// // // // using namespace std;
 
// // // // insertArr
 
 
// // // // int main()
// // // // {
// // // //         int arr[50];
// // // //       int i,size,num,pos;
// // // //       cout << "enter the size of the array : ";
// // // //       cin >> size;
// // // //       cout << "enter the element of the array ; ";
// // // //       for(int i=1 ; i<size ; i++)
// // // //       cin >> arr[i];
// // // //       cout << "enter the element to insert in array: ";
// // // //       cin >> num;
// // // //       cout << "enter the position of array: ";
// // // //       cin >> pos;

// // // //       if(pos> size+1 || pos <=0)
// // // //       cout << "invalid postion" << endl;
// // // //       else{
// // // //           cout << "before insertion";

// // // //           for(i=0 ; i< size ; i++)
// // // //           cout << arr[i];
// // // //           insertArr(arr, num, pos ,size);

// // // //           cout << "after insertion";

// // // //           for(i=0 ; i< size ; i++)
// // // //           cout << arr[i];
// // // //           insertArr(arr, num, pos ,size);
// // // //       }

 
// // // //       return 0;
// // // // }


// // #include<bits/stdc++.h>
// // using namespace std;
 
 
 
// // int main()
// // {
  
// //       int n;
// //       cin >> n; 
// //       int arr[n];
// //       for(int i=0 ; i<n ; i++){
// //           cin >> arr[i];
// //       }
// //         cout << "current Array: ";
// //         for(int i=0 ; i<n ; i++){
// //             cout << arr[i] << " ";
// //         }
// //          cout << endl;
// //         cout << "enter the element for insertion: ";
// //         int newEle;
// //         cin >> newEle;
// //         cout << endl;
// //         cout << "enter the position for new element: ";
// //         int newPos;
// //         cin >> newPos;

// //         for(int i=0 ; i<n ; i++){
// //             if(newPos<n || newPos <0){
// //                 cout << "Invalid Position!"<< endl;
// //             }
// //             else if(arr[i]==newPos){
// //                 arr[i]==arr[newPos];
// //                 arr[newPos]= arr[newEle];
// //                 cout << arr[i];
// //             }
// //         }
 
// //       return 0;
// // }

// #include<bits/stdc++.h>
// using namespace std;
 
//  void display(int arr[], int n){
//      for(int i=0 ; i<n ; i++){
//          cout << arr[i] <<" " ;
//      }
//     cout  << endl;
//  }
 
//   int indInsertion(int arr[],int  size, int element, int capacity, int index){
//        if(size >= capacity){
//            return -1;
//        }
//        for(int i=size-1; i>= index ;i--){
//            arr[i+1] = arr[i];
//        }
//        arr[index] = element;
//        return 1;
//    }

// int main()
// {
 
//       int arr[100]= {7,8,12,27,88};
//       int size = 5,element=45, index= 3;
//       display(arr, 4);
//       indInsertion(arr, size, element, 100, index);
//       size+=1;
//       display(arr, size);
 
//       return 0;
// }

#include<bits/stdc++.h>
using namespace std;
 
 void displayArr(int arr[], int size){
     for(int i=1 ; i<=size ; i++){
         cout << arr[i] << " ";
     }
     cout << endl;
 }

 void insertArr(int arr[], int size, int pos, int ele){
     if(pos > size-1 || pos <0){
         cout << "invalid position" << " ";
     }
    
     else
     {
         for(int i=1 ; i<=size ; i++){
          arr[pos] = ele;
         cout << arr[i] << " ";
     }
     }
     cout << endl;
 }
 
int main()
{

      int n,position, element;
      cin >> n ;
      int arr[n];
      for(int i=1 ; i<=n ; i++ ){
          cin >> arr[i];
      }
      cin >> position >> element;
     cout << "current array: " ;
    displayArr(arr, n);
    cout << endl;
    cout << endl;
    cout << "Array after insertion: ";
     insertArr(arr, n, position, element);
 
      return 0;
}
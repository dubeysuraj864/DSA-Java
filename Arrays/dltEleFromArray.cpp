#include <bits/stdc++.h>
using namespace std;

void displayArr(int arr[], int size)
{
    for (int i = 0; i <size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int deleteArr(int arr[], int size, int index)
{
   for(int i=index-1; i<size-1; i++){
       arr[i]= arr[i+1];
   }
 
   return (size-1);
}

int main()
{

    int n, idx;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cin >> idx;
    displayArr(arr, n);

    cout << endl;

    deleteArr(arr, n, idx);

    displayArr(arr, n);


    return 0;
}
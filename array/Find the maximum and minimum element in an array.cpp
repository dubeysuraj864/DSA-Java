#include<bits/stdc++.h>
using namespace std;

struct Pair{
    int min;
    int max;
};

struct Pair getMinMax(int arr[],int n)
{
    struct Pair minmax;
    int i;
    if(n==1){
        minmax.max= arr[0];
        minmax.min=arr[0];
        return minmax;
    }

    if(arr[0]>arr[1]){
        minmax.max= arr[0];
        minmax.min= arr[1];
    }
    
    else{
        minmax.max= arr[1];
        minmax.min= arr[0];
    }

    for(i=2 ; i<n ; i++){
        if(arr[i] > minmax.max)
            minmax.max= arr[i];

            else if(arr[i] < minmax.min)
                minmax.min = arr[i];
    }
    return minmax;
    
}

 
int main()
{

    int arr[] ={123, 123, 436,45 ,456,467,4};

    int arr_size = sizeof(arr)/sizeof(arr[0]);

    struct Pair minmax = getMinMax(arr, arr_size);

    cout << "Minimum element is " << minmax.min << endl;

    cout << "Maximum element is " << minmax.max << endl;

      return 0;



}
#include <iostream>
#include <string.h>
using namespace std;

int main(){

    string a;
    cin >> a;

    switch(a){
        case "apple":
        cout << "Apple is red in color";
        break;

        case "banana":
        cout << "Banana is yellow in color";
        break;

        default:
        cout << "Oops!";
    }

    return 0;
}
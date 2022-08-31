#include <iostream>
#include <string>
using namespace std;

int main()
{

    // int age;
    // cin >> age;
    // string result;

    // result = (age >= 18) ? "You can vote" :  "you can not vote";

    // cout << result;

    int year;
    cin >> year;

    if (year % 4 == 0){
        cout << "Leap year";
    }
    else{
        cout << "Not Leap Year";
    }

    return 0;
}
#include <iostream>

using namespace std;

int add(int x, int y)
{
    return x + y;
}

int substraction(int x, int y)
{
    return x - y;
}
int multiply(int x, int y)
{
    return x * y;
}
int divide(int x, int y)
{
    return x / y;
}
int module(int x, int y)
{
    return x % y;
}

int main()
{

    int addFunction = add(3, 4);
    int substrationFunction = substraction(34, 34);
    int multiplyFunction = multiply(34, 34);
    float divideFunction = divide(34, 100);
    int moduleFunction = module(23, 98);

    cout << addFunction << endl;
    cout << substrationFunction << endl;
    cout << multiplyFunction << endl;
    cout << divideFunction << endl;
    cout << moduleFunction << endl;

    return 0;
}

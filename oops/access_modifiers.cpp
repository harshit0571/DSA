#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

class Student
{
private:
    int marks;

public:
    string name;
    void fill(int x, string y)
    {
        marks = x;
        name = y;
    }
    void show()
    {
        cout << "private member " << marks << endl;
        cout << "public member " << name << endl;
    }
};

int main()
{
    Student obj1;
    obj1.fill(10, "harshit");
    obj1.show();
}

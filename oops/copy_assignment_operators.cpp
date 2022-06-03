#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
class Student
{
public:
    int marks;
    Student() {}
    Student(int marks)
    {
        this->marks = marks;
    }
    void show()
    {
        cout << "marks is " << marks << endl;
    }
};

int main()
{
    Student obj1(10);
    Student obj2(25);
    obj1 = obj2;
    obj1.show();
}
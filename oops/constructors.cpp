#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
class Student
{
    int marks;

public:
    Student() {}
    Student(int x)
    {
        marks = x;
    }
    void show()
    {
        cout << marks;
    }
};
int main()
{
    Student *obj1 = new Student(3);
    obj1->show();
}
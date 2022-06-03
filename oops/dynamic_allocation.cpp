#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
class Student
{
public:
    int marks = 10;
    void show()
    {
        cout << marks << endl;
    }
};

int main()
{
    Student *obj1 = new Student;
    obj1->show();
    cout << obj1->marks;
}
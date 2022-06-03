#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
class Student
{
public:
    int marks;
    Student()
    {
    }
    Student(int marks)
    {
        this->marks = marks;
    }
    ~Student()
    {
        cout << "destructor called" << endl;
    }
};
int main()
{
    Student s1(10);
    Student *S1 = new Student(15);
    cout << S1->marks;
    delete S1;
    cout << S1->marks;
}
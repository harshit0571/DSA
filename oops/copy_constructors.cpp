#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
class Student
{
public:
    int marks;
    Student(Student &temp)
    {
        this->marks = temp.marks;
    }
    Student(int marks)
    {
        this->marks = marks;
    }
    void show()
    {
        cout << marks << endl;
    }
};
int main()
{
    Student S1(10);
    S1.show();
    Student S2(S1);
    S2.show();
}
#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
class Student
{
public:
    int marks;
    static string School_Name;
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

string Student::School_Name = "abc";
int main()
{
    cout << Student::School_Name;
}
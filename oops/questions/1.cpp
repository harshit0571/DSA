// Problem Statement
// A ComplexNumber class contains two data members: one is the real part (R) and the other is imaginary (I) (both integers).
// Implement the Complex numbers class that contains the following functions -

// link->
// https://www.codingninjas.com/codestudio/guided-paths/basics-of-c/content/118817/offering/1381814?leftPanelTab=0

// #include<iostream>

// using namespace std;

// class ComplexNumbers {
//     private:
//     int real;
//     int imaginary;
//     public:
//     ComplexNumbers(int real, int imaginary){
//         this->real=real;
//         this->imaginary=imaginary;
//     }
//     void print(){
//         cout<<real<<" + i"<<imaginary;
//     }
//     void plus(ComplexNumbers &temp){
//         this->real=this->real+temp.real;
//         this->imaginary=this->imaginary+temp.imaginary;
//     }
//     void multiply(ComplexNumbers &temp){
//         int temp1=(this->real*temp.real)-(temp.imaginary*this->imaginary);
//         this->imaginary=(this->imaginary*temp.real)+(this->real*temp.imaginary);
//         this->real=temp1;
//     }

// };

// int main() {
//     int real1, imaginary1, real2, imaginary2;

//     cin >> real1 >> imaginary1;
//     cin >> real2 >> imaginary2;

//     ComplexNumbers c1(real1, imaginary1);
//     ComplexNumbers c2(real2, imaginary2);

//     int choice;
//     cin >> choice;

//     if (choice == 1) {
//         c1.plus(c2);
//         c1.print();
//     } else if (choice == 2) {
//         c1.multiply(c2);
//         c1.print();
//     } else {
//         return 0;
//     }

// }
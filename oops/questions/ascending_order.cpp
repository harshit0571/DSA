// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

class Student{
    private:
    string name;
    int m1;
    int m2;
    int m3;
    public:
    int total;    
    int roll;
    void show(){
        cout<<name<<" "<<roll<<" "<<total<<endl;
    }
    void ben10(){
        cin>>this->name>>this->roll>>this->m1>>this->m2>>this->m3;
        this->total=this->m1+this->m2+this->m3;
    }
    
};

int main() {
    // Write C++ code here
    Student obj[4];
    for(int i=0;i<4;i++){
        cout<<"enter marks";
        obj[i].ben10();
    }
    for(int i=0;i<3;i++){
        for(int j=i+1;j<4;j++){
            if(obj[i].total>obj[j].total){
                swap(obj[i], obj[j]);
            }
        }
    }
    for(int i=3;i>=0;i++){
        obj[i].show();
    }

    return 0;
}

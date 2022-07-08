class Solution {
public:
    int fib(int n) {
        int one=0;
        int two=1;
        int sum=0;
        if(n<2){
            return n;
        }
        for(int i=0;i<n;i++){
            sum=one+two;
            one=two;
            two=sum;
        }
        return one;
    }
};

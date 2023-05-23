class Solution {
    public int tribonacci(int n) {
        if(n<2){
            return n;
        }
        int count=2;
        int a=0;
        int b=1;
        int c=1;
        while(count<n){
            int sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            count++;
        }
        return c;
    }
}

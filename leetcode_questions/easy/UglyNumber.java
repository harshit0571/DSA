class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%2==0){
                n=n/2;
                System.out.println(n);
                continue;
            }
            if(n%3==0){
                n=n/3;
                System.out.println(n);
                continue;
            }
            if(n%5==0){
                n=n/5;
                System.out.println(n);
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}




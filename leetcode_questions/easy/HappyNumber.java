class Solution {
    public boolean isHappy(int n) {
        int t=0;
        int sum=n;
        HashSet<Integer> set=new HashSet<>();
        while(set.add(sum)){
            t=sum;
            sum=0;
            // System.out.print(t+" ");
            while(t>0){
                int i=t%10;
                sum=sum+i*i;
                t=t/10;
            }
            if(sum == 1){
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public int missingNumber(int[] arr) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum+=i+1;
            sum2+=arr[i];
        }

        return sum-sum2;
    }
}

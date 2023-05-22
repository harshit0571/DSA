class Solution {
    public int[] twoSum(int[] arr, int t) {
        int[] ans=new int[2];
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[right]+arr[left];
            if(sum==t){
                ans[0]=left+1;
                ans[1]=right+1;
            }
            if(sum>t){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }
}

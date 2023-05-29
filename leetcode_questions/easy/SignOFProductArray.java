class Solution {
    public int arraySign(int[] nums) {
        int neg=0;
        boolean zero=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg++;
            }
            else if(nums[i]==0){
                return 0;
            }
        }
        return neg%2 ==0 ? 1 : -1;
    }
}

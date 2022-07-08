class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int sum=0;
        int left=0;
        int right;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
        }
        
        for(int i=0;i<nums.size();i++){
            if(i>0){
                left+=nums[i-1];
            } 
             right=sum-nums[i]-left;
            if(left==right){
                return i;
            }
        }
        return -1;
    }
};

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for(int i=0;i<nums.size()-1;i++){
            int bit=nums[i]^nums[i+1];
            if(bit==0){
                return 1;
            }
        }
        return 0;
    }
};

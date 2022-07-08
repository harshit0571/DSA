class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> ans;
        int i=0;
        while(i<nums.size()){
            ans.push_back(nums[nums[i]]);
            i=i+1;
        }
        return ans;
        
    }
};

class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> r;
        for(int i = 0; i < nums.size(); ++i) {
            if(r.empty() || nums[i] > nums[i - 1] + 1) 
                r.emplace_back(to_string(nums[i]));
            else if(i == nums.size() - 1 || nums[i + 1] > nums[i] + 1) 
                r.back() += "->" + to_string(nums[i]);
        }
        return r;
    }
};

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int t) {
        int start,end,mid;
        start=0;
        end=nums.size()-1;
        vector<int> ans(2,-1);
        
        while(start<=end){
            mid=start+(end-start)/2;
            if(t==nums[mid]){
                end=mid-1;
                ans[0]=mid;
            }
            else if(t>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        
        start=0;
        end=nums.size()-1;
        
        while(start<=end){
            mid=start+(end-start)/2;
            if(t==nums[mid]){
                start=mid+1;
                ans[1]=mid;
            }
            else if(t>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        
        return ans;
    }        
};

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& a) {
        vector<vector<int>> ans;
        sort(a.begin(),a.end());
        int n= a.size();
        int k,j;
        for(int i=0;i<n-2;i++){
            k=i+1;
            j=n-1;
            while(k<j){
                int target=a[i]+a[k]+a[j];
                if(target==0){
                    ans.push_back({a[i], a[k], a[j]});
                    while(k<j && a[k]==a[k+1]){
                        k++;
                    }
                    while(k<j && a[j]==a[j-1]){
                        j--;
                    }
                    k++;
                    j--;
                }
                else if(target>0){
                    j--;
                }
                else{
                    k++;
                }
            }
            while(i<n-1 && a[i]==a[i+1]){
                i++;
            }
        }
        
        
        return ans;
        
    }
};




//java

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int prev=nums[0];
        for(int i=0;i<nums.length-2;i++){
            if(prev==nums[i] && i!=0){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while(nums[left]==nums[left-1] && left<right){
                        left++;
                    }
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
            prev=nums[i];
        }
        return ans;
       
    }
}

// -1 -1 0 1 2 4
// -2 0 0 2 2


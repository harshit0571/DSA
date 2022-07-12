class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        int count=1;
        vector<int> ans;
        sort(arr.begin(), arr.end());
        for(int i=0;i<arr.size()-1;i++){
            if(arr[i]==arr[i+1]){
                count++;           
            }
            else{
                ans.push_back(count);
                count=1;
            }
        }
        
        if(arr[arr.size()-1]!=arr[arr.size()-2]){
            ans.push_back(1);
        }
        else{
            ans.push_back(count);
        }
        
        sort(ans.begin(), ans.end());
        cout<<ans.size();
        for(int i=0;i<ans.size()-1;i++){
            if(ans[i]==ans[i+1]){
                return 0;
            }
        }
        return 1;
    }
};

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

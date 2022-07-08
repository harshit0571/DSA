class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int max_=0;
        int sum;
        for(int i=0;i<accounts.size();i++){
            sum=0;
            for(int j=0;j<accounts[i].size();j++){
                sum=sum+accounts[i][j];
            }
            max_=max(sum,max_);
            
        }
        return max_;
    }
};

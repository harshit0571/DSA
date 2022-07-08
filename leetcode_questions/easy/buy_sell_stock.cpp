class Solution {
public:
    int maxProfit(vector<int>& p) {
        int max_=0;
        int buy=INT_MAX;
        for(int i=0;i<p.size();i++){
            buy=min(p[i], buy);
            max_=max(max_, p[i]-buy);
        }
        return max_;
    }
};

class Solution {
public:
    vector<int> runningSum(vector<int>& a) {
        int sum=0;
        for(int i=0;i<a.size();i++){
            sum+=a[i];
            a[i]=sum;
        }
        return a;
    }
};

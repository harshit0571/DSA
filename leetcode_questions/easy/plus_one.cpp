class Solution {
public:
    vector<int> plusOne(vector<int>& d) {
        int sum=0;
        for(int i=d.size()-1;i>=0;i--){
            if(d[i]!=9){
                d[i]++;
                return d;
            }
            d[i]=0;
        }
        d.resize(d.size()+1);
        d[0]=1;
        return d;
    }
};

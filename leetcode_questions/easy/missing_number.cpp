class Solution {
public:
    int missingNumber(vector<int>& n) {
        int i=0;
        while(i<n.size()){
            int current=n[i];
            if(n[i]<n.size() && n[i]!=i){
                swap(n[i], n[current]);
             }
            else{
                i++;
            }
        }
    cout<<n[0];
        for(i=0;i<n.size();i++){
            if(n[i]!=i){
                return i;
            }
        }
        return i;
    }
};

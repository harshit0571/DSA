class Solution {
public:
    int longestConsecutive(vector<int>& n) {
        int count=1;
        
        if(n.size()<1){
            return 0;
        }
        sort(n.begin(), n.end());
        int max_=0;
        for(int i=0;i<n.size()-1;i++){
            if(n[i]==n[i+1]){
                continue;
            }
            if(n[i]+1==n[i+1]){
                count++;
            }
            else{
                count=1;
            }
            max_=max(max_, count);
        }
        return max(max_, count);
    }
};

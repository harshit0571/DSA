class Solution {
public:
    int findDuplicate(vector<int>& n) {
        int i=0;
        while(i<n.size()){
            int current=n[i];
            if(n[i]!=i+1){
                if(n[current-1]!=current){
                    swap(n[current-1], n[i]);
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        for(int i=0;i<n.size();i++){
            if(n[i]!=i+1){
                return n[i];
            }
        }
        return 1;
    }
};

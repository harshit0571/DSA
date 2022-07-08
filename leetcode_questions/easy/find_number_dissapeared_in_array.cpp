class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& n) {
        vector<int> a;
        int i=0;
        while(i<n.size()){
            int current=n[i];
            if(n[i]!=i+1){
                if(n[current-1]!=current){
                    swap(n[i], n[current-1]);
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
                a.push_back(i+1);
            }
        }
        return a;
    }
};

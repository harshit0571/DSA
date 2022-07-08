class Solution {
public:
    vector<int> findErrorNums(vector<int>& n) {
        vector<int> a(2);
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
                a[0]=n[i];
                a[1]=i+1;
            }
        }
        return a;
    }
};

class Solution {
public:
    int searchInsert(vector<int>& n, int t) {
        int u=n.size()-1;
        int l=0;
        int mid;
        
        while(l<=u){
            mid=l+(u-l)/2;
            if(n[mid]==t){
                return mid;
            }
            else if(n[mid]>t){
                u=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
        
    }
};

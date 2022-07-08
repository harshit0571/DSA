class Solution {
public:
    int maxArea(vector<int>& a) {
        int u,l;
        u=a.size()-1;
        l=0;
        int height;
        int ans=0;
        int max_=INT_MIN;
        
        while(l<u){
            height=min(a[u], a[l]);
            ans=height*(u-l);
            if(a[u]<a[l]){
                u--;
            }
            else{
                l++;
            }
            max_=max(ans, max_);
            
        }
        return max_;
    }
};

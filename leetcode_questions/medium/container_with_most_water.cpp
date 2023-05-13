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



//java sol
class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int max=0;
        while(left<right){
            int vol=Math.min(h[left], h[right]) * (right-left);
            max=Math.max(max, vol);
            int a=h[left]>h[right] ? right--: left++;
        }
        return max;
    }
}

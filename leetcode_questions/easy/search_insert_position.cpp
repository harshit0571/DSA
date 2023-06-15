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




//java soln
class Solution {
    public int searchInsert(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}

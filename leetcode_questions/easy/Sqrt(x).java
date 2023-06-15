class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int low = 1,high = x,ans =0;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(x/mid==mid)  return mid;
            else if(x/mid<mid)   high=mid-1;
            else {low = mid+1; ans = mid;}
        }
        return ans;
    }
}




class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return x;
        }
        int right=x, left=1;
        while(left<=right){
            int mid=left+(right-left)/2;
            System.out.println(mid);
            if(mid/x==mid){
                return mid;
            }
            else if(mid>x/mid){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return right;
    }
}

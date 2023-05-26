class Solution {
    public int search(int[] arr, int t) {
        int right=arr.length-1;
        int left=0;
        while(left<=right){
            int mid= (right-left)/2 + left;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}

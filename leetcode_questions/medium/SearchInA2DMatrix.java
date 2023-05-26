class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int m=arr[0].length;
        int left=0;
        int right=m-1;
        int count=0;
        int n=arr.length;
        while(left<=right && count<n){
            int mid=left + (right - left)/2;
            System.out.println(left+" "+right+" "+mid);
            if(arr[count][mid]==t){
                return true;
            }
            else if(arr[count][mid] > t){
                right=mid-1;
            }
            else if(arr[count][mid]<t){
                 System.out.println(left+" "+right+" "+mid);
                if(t > arr[count][right]){
                    count++;
                    left=0;
                    right=m-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return false;

    }
}

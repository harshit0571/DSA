class Solution {
    public int[] searchRange(int[] arr, int t) {
        int[] ans={-1,-1};
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==t){
                ans[0]=i;
                break;
            }
        }
        for(int j=arr.length-1;j>=i;j--){
            if(arr[j]==t){
                ans[1]=j;
                break;
            }
        }

        return ans;
    }
}

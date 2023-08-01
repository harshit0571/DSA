class Solution {
    public int smallestRangeII(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int res=arr[n-1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            int max=Math.max(arr[i]+k, arr[n-1]-k);
            int min=Math.min(arr[i+1]-k, arr[0]+k);
            res=Math.min(res, max-min);
        }        
        return res;

    }
}

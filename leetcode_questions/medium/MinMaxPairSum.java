class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int e=0;
        int s=arr.length-1;
        int max=0;
        int sum=0;
        while(e<s){
            sum=arr[e]+arr[s];
            max=Math.max(max, sum);
            e++;
            s--;
            sum=0;
        }
        return max;
    }
}

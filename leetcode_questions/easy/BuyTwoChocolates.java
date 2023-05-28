class Solution {
    public int buyChoco(int[] arr, int m) {

        Arrays.sort(arr);

        int sum= arr.length>=2 ? arr[0]+arr[1] : m;
        if(sum >m){
            return m;
        }
        return m-sum;
    }
}

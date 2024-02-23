class Solution {
    public int singleNumber(int[] arr) {
        int x=arr[0];
        for(int i=1;i<arr.length;i++){
            x=x^arr[i];
        }
        return x;
    }
}

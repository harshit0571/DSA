class Solution {
    void reverse(int[] arr, int s, int e){
        int left=s;
        int right=e;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        reverse(arr, 0, arr.length-1);
        int c=k-1;
        reverse(arr, 0, c);
        reverse(arr, k, arr.length-1);
    }
}

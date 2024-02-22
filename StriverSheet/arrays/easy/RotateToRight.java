class Solution {
    void rot(int[] arr, int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] arr, int k) {
        // 1 2 3 4 5 6 7
        // 7 6 5 4 3 2 1
        // 5 6 7 1 2 3 4
     
        int n=arr.length;
        k=k%n;
        rot(arr, 0, n-1);
        rot(arr, 0 , k-1);
        rot(arr, k, n-1);
    }
}

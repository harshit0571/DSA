class Solution {
    public void moveZeroes(int[] arr) {
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(!(arr[i]==0)){
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
        }
    }
}

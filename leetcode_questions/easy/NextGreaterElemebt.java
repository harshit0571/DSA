class Solution {
    int index(int[] arr, int a){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            int a=index(arr2, arr1[i]);
            int max=-1;
            for(int j=a;j<arr2.length;j++){
                if(arr2[j]>arr1[i]){
                    max=arr2[j];
                    break;
                }
            }
            arr1[i]=max;
        }
        return arr1;
    }
};

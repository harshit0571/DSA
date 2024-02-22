class Solution {
    public boolean check(int[] arr) {
        boolean isRotated=false;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                if(isRotated){
                    return false;
                }
                isRotated=true;
            }
        }

        if(!isRotated){
            return true;
        }

        return arr[0]>=arr[arr.length-1];
    }
}

class Solution {
    public int removeDuplicates(int[] arr) {
        int k=0;
        HashSet<Integer> set=new HashSet<>();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                arr[k]=arr[i];
                set.add(arr[i]);
                k++;
            }
        }
// 1 1 2 
        return k;
    }
}

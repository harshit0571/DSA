class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int k=m;
        for(int i=0;i<n;i++){
            n1[k]=n2[i];
            k++;
        }
        Arrays.sort(n1);
    }
}

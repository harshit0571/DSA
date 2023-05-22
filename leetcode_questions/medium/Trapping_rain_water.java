class Solution {
    public int trap(int[] h) {
        int vol=0;
        int maxl=h[0];
        for(int i=0;i<h.length;i++){
            int j=0;

            int maxr=h[i];
            maxl=Math.max(h[i], maxl);
            j=h.length-1;
            while(j>i){
                maxr=Math.max(h[j], maxr);
                j--;
            }
            // System.out.println(maxl+ " "+maxr);
            vol =vol + (Math.min(maxl, maxr)-h[i]); 
        }
        return vol;
    }
}

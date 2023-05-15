class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(h[i]<h[j]){
                    int temp=h[i];
                    h[i]=h[j];
                    h[j]=temp;

                    String tempS=n[i];
                    n[i]=n[j];
                    n[j]=tempS;
                }
            }
        }
        return n;
    }
}



class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        HashMap<Integer, String> map=new HashMap<>();
        for(int i=0;i<n.length;i++){
            map.put(h[i], n[i]);
        }
        Arrays.sort(h);
        String[] ans=new String[h.length];
        int k=0;
        for(int i=h.length-1;i>=0;i--){
            ans[k]=map.get(h[i]);
            k++;
        }
        return ans;
    }
}

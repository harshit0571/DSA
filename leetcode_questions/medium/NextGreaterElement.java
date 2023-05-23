class Solution {
    public int[] nextGreaterElements(int[] n) {
        int[] ans=new int[n.length];
        for(int i=0;i<n.length;i++){
            int val=n[i];
            int max=-1;
            boolean flag=false;
            for(int j=i+1;j<n.length;j++){
                if(n[j]>val){
                    max=n[j];
                    flag=true;
                    break;
                }
            }
            if(!flag){
                for(int j=0;j<i;j++){
                    if(n[j]>val){
                    max=n[j];
                    break;
                    }
                }
            }
            ans[i]=max;
        }
        return ans;
    }
}

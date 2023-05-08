class Solution {
    int count(int[] arr, int a){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }
        return count;
    }
    int check(int[] arr, int a, int n){
        int flag=1;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                flag=0;
            }
        }
        return flag;
    }
    int kth(int[] arr,int a){
        int[] new_arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            new_arr[i]=arr[i];
        }
        Arrays.sort(new_arr);
       
        return new_arr[arr.length-a];
    }
    public int[] topKFrequent(int[] arr, int k) {
        int[] ans=new int[arr.length];
        int count=0;
        int[] ret=new int[k];
        int j=0;
        for(int i=0;i<arr.length;i++){
            int c=check(ans, arr[i], count);
            if(i==0){
                ans[j]=arr[i];
                j++;
                count++;
            }
            else if(c==1){
                ans[j]=arr[i];
                j++;
                count++;
            }
        }
        int[] freq=new int[count];
        for(int i=0;i<count;i++){
            int c=count(arr, ans[i]);
            freq[i]=c;
        }
        int a=kth(freq, k);
        j=0;
        System.out.println(a);

        for(int i=0;i<count;i++){
            System.out.println(ans[i] + " "+freq[i]);
        }
        
         for(int i=0;i<count;i++){
            if(freq[i]>=a && j<k){
                int c=check(ret, ans[i], j);
                if(i==0){
                    ret[j]=ans[i];
                    j++;
                 }
                 else if(c==1){
                     ret[j]=ans[i];
                     j++;
                 }
             }
         }
         return ret;
    }
}

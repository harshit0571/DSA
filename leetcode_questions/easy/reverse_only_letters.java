class Solution {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        char[] S=s.toCharArray();
        while(left<right){
            if(!(S[left]>='a' && S[left]<='z' || S[left]>='A' && S[left]<='Z')){
               while(left<right && !(S[left]>='a' && S[left]<='z' || S[left]>='A' &&S[left]<='Z')){
                   left++;
               } 
            } 
            if(!(S[right]>='a' && S[right]<='z' || S[right]>='A' && S[right]<='Z')){
               while(right>left && !(S[right]>='a' &&S[right]<='z' || S[right]>='A' &&S[right]<='Z')){
                   right--;
               } 
            } 
            char temp=S[left];
            S[left]=S[right];
            S[right]=temp;
            left++;
            right--;
        }
        String ans=new String(S);
        return ans;
    }
}

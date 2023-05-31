class Solution {
    public String makeSmallestPalindrome(String s1) {
        int left =0;
        int right=s1.length()-1;
        char[] s=s1.toCharArray();
        while(left<right){
            if(s[left]!=s[right]){
                if(s[right]>s[left]) 
                    s[right] = s[left];
                else
                    s[left]=s[right];
            }
            left++;
               right--;
        }
               return new String(s);
    }
}

class Solution {
    boolean isPalindrome(StringBuilder s){
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=false;
            }
        }
        return flag;
    }

    public boolean validPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(isPalindrome(sb)){
            return true;
        }
        else{
            int left=0;
            int right=s.length()-1;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    StringBuilder s1=new StringBuilder(s);
                    StringBuilder s2=new StringBuilder(s);
                    s1.deleteCharAt(left);
                    s2.deleteCharAt(right);                    
                    if(isPalindrome(s1)){
                        return true;
                    }else if(isPalindrome(s2)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                left++;
                right--;
            }
        }
        return false;
    }
}

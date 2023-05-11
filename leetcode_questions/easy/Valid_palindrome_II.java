class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        String SB=sb.toString();
        if(SB.equals(sb.reverse().toString())){
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
                    String S1=s1.toString();
                    String S2=s2.toString();  

                    if(S1.equals(s1.reverse().toString())){
                        return true;
                    }else if(S2.equals(s2.reverse().toString())){
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

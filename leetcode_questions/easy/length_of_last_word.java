class Solution {
    public int lengthOfLastWord(String s) {
        String ans="";
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                while(i<s.length() && s.charAt(i)==' '){
                    i++;
                }
                flag=0;
                i--;
            }
            else{
                if(flag==0){
                    ans="";
                    ans=ans+s.charAt(i);
                    flag=1;
                }
                else{
                    ans=ans+s.charAt(i);
                }
            }
        }
        return ans.length();
    }
}

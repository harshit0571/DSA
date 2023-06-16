class Solution {
    public String reverseWords(String S) {
        String[] str=S.split(" ");
        String s="";
        for(int i=0;i<str.length;i++){
            StringBuilder sb=new StringBuilder(str[i]);
            s+=sb.reverse().toString();
            s+=(i==str.length-1 ? "":" ");
        }       
        return s;
    }
}

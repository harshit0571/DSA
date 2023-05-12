class Solution {
    int linear(StringBuilder sb, char I){
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==I){
                return i;
            }
        }
        return -1;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<t.length();i++){
            int a=linear(sb, t.charAt(i));
            if(a>=0){
                sb.deleteCharAt(a);
            }
        }
        if(sb.length()!=0){
            return false;
        }
        return true;

    }
}

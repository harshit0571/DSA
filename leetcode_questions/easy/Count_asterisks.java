class Solution {
    public boolean isCircularSentence(String s) {
        char first=s.charAt(0);
        boolean flag=false;
        char prev=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                flag=true;
                continue;
            }
            if(flag){
                System.out.println(s.charAt(i)+" "+prev);
                if(s.charAt(i)!=prev){
                    return false;
                }
                flag=false;
            }
            else{
                prev=s.charAt(i);
            }
        }
        if(first==s.charAt(s.length()-1)){
            return true;
        }
        return false;
    }
}

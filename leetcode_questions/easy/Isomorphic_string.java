class Solution {
    boolean ret(String s, String t){
        boolean flag=true;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
                char s1=s.charAt(i);
                if(set.contains(s1)){
                    continue;
                }
                else{
                    set.add(s1);
                }
                char t1=t.charAt(i);
                for(int j=i;j<t.length();j++){
                    if(t.charAt(j)==t1){
                        if(!(s.charAt(j)==s1)){
                            return false;
                        }
                    }
                }
        }
        return flag;
    }
    boolean ans=true;
    boolean ans2=true;
    public boolean isIsomorphic(String s, String t) {
        boolean flag=true;
        if(s.length()!=t.length()){
            return false;
        }
        else{
            ans=ret(s, t);
            ans2=ret(t, s);
        }

        return ans && ans2;
    }
}

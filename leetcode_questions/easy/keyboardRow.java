class Solution {
    boolean first(String s){
        s=s.toLowerCase();
        String str="qwertyuiop";
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i)) ==-1){
                return false;
            }
        }   
        return true;
    }
    boolean second(String s){
        s=s.toLowerCase();
        String str="asdfghjkl";
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i)) ==-1){
                return false;
            }
        }   
        return true;
    }
    boolean third(String s){
        s=s.toLowerCase();
        String str="zxcvbnm";
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i)) ==-1){
                return false;
            }
        }   
        return true;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(first(words[i])){
                ans.add(words[i]);
            }
            if(second(words[i])){
                ans.add(words[i]);
            }
            if(third(words[i])){
                ans.add(words[i]);
            }
        }   
        
        String[] str=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            str[i]=ans.get(i);
        }
        return str;
    }
}

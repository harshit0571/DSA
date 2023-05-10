class Solution {
    public String sortSentence(String s) {
        String ans="";
        int num=0;
        HashMap<Integer, String> map=new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    num=num*10+((int) (s.charAt(i)-'0'));
                    i++;
                }
                map.put(num, ans);
                ans="";
                num=0;
            }
            else{
                if(s.charAt(i)!=' '){
                    ans=ans+s.charAt(i);
                }
    
            }
        }
        int n=map.size();
        ans="";
        for(int i=1;i<=n;i++){
            if(i==n){
                ans=ans+map.get(i);
            }
            else{
                ans=ans+map.get(i)+" ";
            }    
        }
        return ans;
    }
}

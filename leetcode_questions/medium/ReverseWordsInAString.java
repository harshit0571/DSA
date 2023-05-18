class Solution {
    public String reverseWords(String s) {
        StringBuilder temp=new StringBuilder();
        boolean flag=false;
        String ans="";
        boolean first=true;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(flag){
                    System.out.println(i);
                    ans=ans+ (first ? "":" ") + temp.reverse().toString();
                    temp.delete(0, temp.length());
                    flag=false;
                    first=false;
                }
            }
            else{
                flag=true;
                temp.append(s.charAt(i));
                if(i==0 && s.charAt(i)!=' '){
                    ans=ans+ (first ? "":" ")  +temp.reverse().toString();
                }
            }
        }
        return ans;
    }
}

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder();
        int i1=num1.length()-1;
        int i2=num2.length()-1;
        int carr=0;
        for(;i1>=0 || i2>=0 || carr==1;i1-- , i2--){
            int x= i1>=0 ? num1.charAt(i1)-'0' : 0;
            int y= i2>=0 ? num2.charAt(i2)-'0' : 0;
            ans.append((x+y+carr)%10);
            carr=((x+y+carr)/10);
        }
        return ans.reverse().toString();
    }
}

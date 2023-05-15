class Solution {
    public String addBinary(String a, String b) {
        int i1=a.length()-1;
        int i2=b.length()-1;
        int carr=0;
        StringBuilder sb=new StringBuilder();
        for(;i1>=0 || i2>=0 || carr==1 ;i1--, i2--){
            int x= i1>=0 ? a.charAt(i1)-'0' : 0;
            int y= i2>=0 ? b.charAt(i2)-'0' : 0;
            if(x==1 && y==1){
                sb.append(0+carr);
                carr=1;
            }   
            else{
                if(x+y==1 && carr==1){
                    sb.append(0);
                    carr=1;
                }
                else{
                    sb.append(x+y+carr);
                    carr=0;
                }
            }       
        }
        return sb.reverse().toString();
    }
}

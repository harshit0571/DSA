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


//second soln
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder();
        int i1=num1.length()-1;
        int i2=num2.length()-1;
        char carr='0';
        while(i1>=0 && i2>=0){
            String sum=(num1.charAt(i1) -'0')+ (num2.charAt(i2)-'0') + (carr-'0') +"";
            if(sum.length()>1){
                ans.append(sum.charAt(1));
                carr=sum.charAt(0);
            }
            else{
                ans.append(sum.charAt(0));
                carr='0';
            }
            System.out.println(sum);
            i1--;
            i2--;
        }
        while(i1>=0){   
            String sum=(num1.charAt(i1) -'0')+(carr-'0') +"";
            if(sum.length()>1){
                ans.append(sum.charAt(1));
                carr=sum.charAt(0);
            }
            else{
                ans.append(sum.charAt(0));
                carr='0';
            }
            i1--;
        }
        while(i2>=0){
            String sum=(num2.charAt(i2) -'0')+(carr-'0') +"";
            if(sum.length()>1){
                ans.append(sum.charAt(1));
                carr=sum.charAt(0);
            }
            else{
                ans.append(sum.charAt(0));
                carr='0';
            }
            i2--;
        }
        if(carr!='0'){
            ans.append(carr);
        }
        return ans.reverse().toString();
    }
}

class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            ans=ans+ ((int)s.charAt(i)-96)+"";
        }

        while(k>0){
            int i=0;
            sum=0;
            while(i<ans.length()){
                sum=sum+((int)ans.charAt(i)-'0');
                System.out.println((int)ans.charAt(i)-'0');
                i++;
            }
            ans=""+sum;
            k--;
        }
        return sum;
    }
}

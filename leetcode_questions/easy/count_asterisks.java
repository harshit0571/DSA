class Solution {
    public int countAsterisks(String s) {
        boolean flag=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                if(flag){
                    flag=false;
                    continue;
                }
                else{
                    flag=true;
                }
            }
            if(s.charAt(i)=='*' && !flag){
                count++;
            }
        }
        return count;
    }
}

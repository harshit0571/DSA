class Solution {
    public int strStr(String str1, String str2) {
        int k=0;
        boolean flag=true;
        int index=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(0)){
                int t=i;
                while(k<str2.length() && t<str1.length()){
                    // System.out.println(t+" "+k);
                    if(str1.charAt(t)!=str2.charAt(k)){
                        flag=false;
                        break;
                    }
                    t++;
                    k++;
                }
                if(k==str2.length() && flag==true){
                    return i;
                }
            }
            k=0;
            flag=true;
        }
        return -1;
    }
}

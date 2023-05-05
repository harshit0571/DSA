class Solution {
    String reverse(int c){
        String sum="";
        while(c>0){
            int i=c%10;
            sum=sum+(char)(i+'0');
            c=c/10;
        }
        return sum;
    }
    public int compress(char[] chars) {
        int count=0;
        int index=0;
        for(int i=0;i<chars.length;i++){
            int c=1;
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    c++;
                }
                else{
                    break;
                }
            }
            chars[index]=chars[i];            
            index++;
            if(c>1){
                if(c>9){
                    String rev=reverse(c);
                    int x=rev.length()-1;
                    while(x>=0){
                                                System.out.println(rev);
                        chars[index]=rev.charAt(x);
                        index++;
                        x--;
                    }
                }
                else{
                    chars[index]= (char)(c+'0');
                    index++;
                }
            }
            i=i+c-1;
        }
        
        return index;

    }
}

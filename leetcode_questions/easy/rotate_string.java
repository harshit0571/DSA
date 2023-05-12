class Solution {
    boolean rotate(char[] s, String g, int index){
        String s_=new String(s);
        System.out.println(s);
        if(index==s.length){
            return false;
        }
        if(s_.equals(g)){
            return true;
        }
        else{
            for(int i=0;i<s.length-1;i++){
                char temp=s[i];
                s[i]=s[i+1];
                s[i+1]=temp;
            }
            return rotate(s, g,index+1);
        }
    }
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        char[] s1=s.toCharArray();
        return rotate(s1, goal, 0);

    }
}

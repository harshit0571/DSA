class Solution {
    boolean isP(String s){
		StringBuilder sb=new StringBuilder(s);
		if(sb.reverse().toString().equals(s)){
			return true;
		}
		return false;
	}
    public int countSubstrings(String s) {
		int count=0;
		for(int i=0;i<s.length();i++){
			String ans="";
			for(int j=i;j<s.length();j++){
				ans=ans+s.charAt(j);
				if(isP(ans)){
						count++;
				}
			}
		}
		return count;
    }
}

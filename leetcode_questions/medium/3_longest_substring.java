class Solution {
    public int lengthOfLongestSubstring(String S) {
        HashMap<Character, Integer> map=new HashMap<>();
        int n=S.length();
        int start=0;
        int max=0;
        if(n<=0){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(S.charAt(i))){
                start=Math.max(start,map.get(S.charAt(i))+1);
            }
            map.put(S.charAt(i), i);
            max=Math.max(max, i-start+1);
        }
        return max;

    }
}

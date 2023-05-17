class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character, String> map=new HashMap<>();
        int count=0;
        String ans="";
        String[] arr=s.split(" ");
        if(arr.length!=p.length()){
            return false;
        }
        for(int i=0;i<p.length();i++){
            if(map.containsKey(p.charAt(i))){
                if(!map.get(p.charAt(i)).equals(arr[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(p.charAt(i), arr[i]);
            }
        }
        return true;
    }
}

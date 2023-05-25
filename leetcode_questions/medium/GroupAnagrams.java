class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(int i=0;i<s.length;i++){
            int[] alph=new int[26];
            for(int j=0;j<s[i].length();j++){
                alph[s[i].charAt(j) -'a']++;
            }
            String temp=Arrays.toString(alph);
            List<String> arr=map.getOrDefault(temp, new ArrayList<>());
            arr.add(s[i]);
            map.put(temp, arr);
        }
        return new ArrayList<>(map.values());
    }
}

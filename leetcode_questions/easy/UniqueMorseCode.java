class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String ans="";
            for(int j=0;j<words[i].length();j++){
                ans=ans+arr[(int)(words[i].charAt(j)) -97];
            }
            set.add(ans);
        }
        return set.size();
    }
}

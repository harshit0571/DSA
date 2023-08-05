class Solution {
    int linear(StringBuilder sb, char I){
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==I){
                return i;
            }
        }
        return -1;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<t.length();i++){
            int a=linear(sb, t.charAt(i));
            if(a>=0){
                sb.deleteCharAt(a);
            }
        }
        if(sb.length()!=0){
            return false;
        }
        return true;

    }
}



//using array
class Solution {

    public boolean isAnagram(String a, String b) {
          char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (a1.length != a2.length) {
            return false;
        } else {
        boolean flag = true;
        for (int i = 0; i < a2.length; i++) {
        if (a1[i] != a2[i]) {
            return false;
        }
        }
        return flag;
        }
    }
}



//using maps
class Solution {

    public boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if(a.length()!=b.length()){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            } else {
                map.put(a.charAt(i), 1);
            }

            if (map2.containsKey(b.charAt(i))) {
                map2.put(b.charAt(i), map2.get(b.charAt(i)) + 1);
            } else {
                map2.put(b.charAt(i), 1);
            }
        }

        return map.equals(map2);

    }
}


//diff soln using hashmap


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
            else{
                map.put(t.charAt(i),1);
            }           
        }

        for(Character i : map.keySet()){
            if(map.get(i) !=0){
                return false;
            }
        }
        return true;

    }
}

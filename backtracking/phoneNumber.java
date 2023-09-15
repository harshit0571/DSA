import java.util.HashMap;
import java.util.Scanner;

class PhoneNumber {
    static void generate(String N, HashMap<Character, String> Mapping, int position, StringBuffer Solution) {
        if (position == N.length()) {
            System.out.println(Solution);
            return;
        }

        String currMapping = (Mapping.get(N.charAt(position)));
        for (int i = 0; i < currMapping.length(); i++) {
            Solution.append(currMapping.charAt(i));
            generate(N, Mapping, position + 1, Solution);
            // backtrack
            Solution.deleteCharAt(Solution.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        HashMap<Character, String> Mapping = new HashMap();
        Mapping.put('2', "ABC");
        Mapping.put('3', "DEF");
        Mapping.put('4', "GHI");
        Mapping.put('5', "JKL");
        Mapping.put('6', "MNO");
        Mapping.put('7', "PQRS");
        Mapping.put('8', "TUV");
        Mapping.put('9', "WXYZ");
        generate(N, Mapping, 0, new StringBuffer());
    }
}

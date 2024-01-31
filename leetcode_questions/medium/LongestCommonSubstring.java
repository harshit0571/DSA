import java.util.Scanner;

public class StringQ {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        String s2 = inp.next();
        char[] arr1 = s.toCharArray();
        char[] arr2 = s2.toCharArray();

        int j = 0;
        int count = 0;
        String ans1 = "";
        for (int i = 0; i < arr1.length; i++) {
            char target = arr1[i];
            j = count;
            while (j < arr2.length) {
                // System.out.print(arr2[j] + " " + target + " " + i);
                if (target == arr2[j]) {
                    ans1 = ans1 + target;
                    j++;
                    count = j;
                    break;
                }
                j++;
            }
        }

        String ans2 = "";
        j = 0;
        count = 0;
        for (int i = 0; i < arr2.length; i++) {
            char target = arr2[i];
            j = count;
            while (j < arr1.length) {
                // System.out.print(arr2[j] + " " + target + " " + i);
                if (target == arr1[j]) {
                    ans2 = ans2 + target;
                    j++;
                    count = j;
                    break;
                }
                j++;
            }
        }

        System.out.println(ans1 + " " + ans2);
    }

}

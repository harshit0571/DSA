public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length;

        int maxLength = 0;

        for (int i = 0; i < n; ++i) {
            long currentSum = 0l;
            for(int j = i; j < n; ++j) {
                currentSum += a[j];

                if(currentSum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
}

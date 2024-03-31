class Solution {
    static int[][] dp = new int[1001][1001];

    static int find(int p1, int p2, String s1, String s2){
        if(p1==s1.length() || p2==s2.length()){
            return 0;
        }

        if (dp[p1][p2] != -1)
            return dp[p1][p2];

        if (s1.charAt(p1) == s2.charAt(p2))
            return dp[p1][p2] = (1 + find(p1 + 1, p2 + 1, s1, s2));
        else
            return dp[p1][p2] = Math.max(find(p1 + 1, p2, s1, s2), find(p1, p2 + 1, s1, s2));

    }
    public int longestCommonSubsequence(String t1, String t2) {
         for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return find(0, 0, t1, t2);
    }
}

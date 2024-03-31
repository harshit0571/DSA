//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    static void check(int[][] m, StringBuilder path, int[][] visited, ArrayList<String> ans,int i, int j, int n){
        if(i<0 || i>=n || j<0 || j>=n || m[i][j]==0 || visited[i][j]==1){
            return;
        }
        if(i==n-1 && j==n-1){
            ans.add(path.toString());
            return;
        }
        
        visited[i][j]=1;
        
        path.append("U");
        check(m,path,visited,ans, i-1,j,n);
        path.deleteCharAt(path.length() - 1);
        
        path.append("D");
        check(m,path,visited,ans,  i+1,j,n);
        path.deleteCharAt(path.length() - 1);
        
        path.append("L");
        check(m,path,visited,ans,  i,j-1,n);
        path.deleteCharAt(path.length() - 1);
        
        path.append("R");
        check(m,path,visited,ans,  i,j+1,n);
        path.deleteCharAt(path.length() - 1);
        
        visited[i][j]=0;
        return;
        
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        StringBuilder path = new StringBuilder();
        ArrayList<String> ans = new ArrayList<>();
        int[][] visited = new int[n][n];
        check(m,path,visited, ans, 0, 0, n);
        Collections.sort(ans);
        return ans;
    }
}

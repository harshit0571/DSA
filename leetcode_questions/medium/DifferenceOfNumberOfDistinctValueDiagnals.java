class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                HashSet<Integer> set=new HashSet<>();
                int I=i-1;
                int J=j-1;
                int Lsum=0;
                int Rsum=0;
                while(J>=0 && I>=0){
                    // System.out.println("up");
                    set.add(grid[I][J]);
                    I--;
                    J--;
                }
                Lsum=set.size();
                I=i+1;
                J=j+1;
                set.clear();
                while(J<m && I<n){
                                        // System.out.println("down");
                    set.add(grid[I][J]);
                    I++;
                    J++;                    
                }
                Rsum=set.size();
                ans[i][j]=Math.abs(Lsum-Rsum);
                
            }
        }
        return ans;
    }
}

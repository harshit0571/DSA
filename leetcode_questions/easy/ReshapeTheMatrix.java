class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * (mat[0].length)  != r*c) return mat;
        int[][] ans=new int[r][c];
        int m=0;
        int n=0;
        int i=0;
        int j=0;
        while(m<r && i<mat.length){
            while(n<c){
                if(j>mat[0].length-1){
                    j=0;
                    i=i+1;
                }
                System.out.println(i+" "+j +" "+m+" "+n);
                ans[m][n]=mat[i][j];
                j++;
                n++;
            }
            n=0;
            m++;
        }

        return ans;
    }
}

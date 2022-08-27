package DP;

public class MinimumPathSum {
	 public int minPathSum(int[][] grid) {
	        return chal(0,0,grid, new Integer[grid.length][grid[0].length]);
	    }
	    public int chal(int r, int c,int[][] grid,Integer[][] dp){
	        if(r==grid.length||c==grid[0].length){
	            return 50000;
	        }
	        if(r==grid.length-1 && c==grid[0].length-1){
	            return grid[r][c];
	        }
	        if(dp[r][c]!=null){
	            return dp[r][c];
	        }
	        int sp1 = chal(r+1,c,grid,dp);
	        int sp2 = chal(r,c+1,grid,dp);
	        dp[r][c]=Math.min(sp1,sp2)+grid[r][c];
	        return Math.min(sp1,sp2)+grid[r][c];
	    }
}

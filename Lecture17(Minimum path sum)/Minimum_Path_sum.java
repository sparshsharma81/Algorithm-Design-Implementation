// package Lecture17(Minimum path sum);

public class Minimum_Path_sum {
    //the previous approach was not workingn properly..so now we are applying a dynamic 
    //programming approach to solve this problem
    public static void main(String args[]){
        int[][] grid = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        int[][] dp = new int[grid.length][grid[0].length];

        System.out.println(solve(grid));
    }
    public static int solve(int[][]grid){
        if(i == grid.length-1 && j == grid[0].length-1 ) return grid[i][j];
        if(i == grid.length || j == grid[0].length)return Integer.MAX_VALUE;    
        if(dp[i][j] != 0)return dp[i][j];
        int right = grid[i][j] + solve(grid,i,j+1);
        int down = grid[i][j] + solve(grid,i+1,j);
        return dp[i][j] = Math.min(down,right);
    }
}

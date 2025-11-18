public class lect17{
    public static void main(String args[]){
        int[][] grid = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        System.out.println(solve(grid,0,0));
    }
    public static int solve(int[][] grid, int i, int j){
        if(i == grid.length-1 && j == grid[0].length-1 ) return grid[i][j];
        if(i == grid.length || j == grid[0].length)return Integer.MAX_VALUE;
        
        int down = grid[i][j] + solve(grid,i+1,j);
        int right = grid[i][j] + solve(grid,i,j+1);
        return Math.min(down,right);
    }
}
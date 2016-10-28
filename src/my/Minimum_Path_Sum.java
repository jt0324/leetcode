package my;

/**
 * Created by dean on 16/10/15.
 */
public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        for (int i = 1;i < grid.length; ++i){
            grid[i][0] = grid[i-1][0] + grid[i][0];
        }
        for (int i = 1;i < grid[0].length; ++i){
            grid[0][i] = grid[0][i-1] + grid[0][i];
        }
        for (int i = 1;i < grid.length; ++i){
            for (int j = 1;j < grid[0].length; ++j){
                grid[i][j] = grid[i][j] + Math.min(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
    public void fun(int[][] grid,int i,int j){

    }
}

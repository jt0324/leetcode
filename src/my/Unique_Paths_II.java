package my;

/**
 * Created by dean on 16/11/4.
 */
public class Unique_Paths_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) return 0;
        int[][] route = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0;i < obstacleGrid.length; ++i){
            if (obstacleGrid[i][0] == 1) break;
            else route[i][0] = 1;
        }
        for (int i = 0;i < obstacleGrid[0].length; ++i){
            if (obstacleGrid[0][i] == 1) break;
            else route[0][i] = 1;
        }
        for (int i = 1;i < route.length; ++i){
            for (int j = 1; j < route[0].length; ++j) {
                if (obstacleGrid[i][j] == 1) continue;
                route[i][j] = route[i - 1][j] + route[i][j - 1];
            }
        }
        return route[route.length - 1][route[0].length - 1];
    }
}

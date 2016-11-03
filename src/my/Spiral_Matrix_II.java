package my;

/**
 * Created by dean on 16/11/2.
 */
public class Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int i = 0,j = -1,count = 0;
        while (count < n*n){
            j++;
            while (j < n && res[i][j] == 0){
                res[i][j++] = ++count;
            }
            i++;
            j--;
            while (i < n && res[i][j] == 0){
                res[i++][j] = ++count;
            }
            j--;
            i--;
            while (j >= 0 && res[i][j] == 0){
                res[i][j--] = ++count;
            }
            i--;
            j++;
            while (i >= 0 && res[i][j] == 0){
                res[i--][j] = ++count;
            }
            i++;
        }
        return res;
    }


}

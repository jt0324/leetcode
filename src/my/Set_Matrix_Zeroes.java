package my;

/**
 * Created by dean on 16/11/3.
 */
public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for (int i = 0;i < matrix.length; ++i){
            for (int j = 0;j < matrix[0].length; ++j){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    column[i] = 1;
                }
            }
        }
        for (int i = 0;i < row.length;++i){
            if (row[i] == 1){
                for (int j = 0;j < matrix[0].length; ++j){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0;i < column.length;++i){
            if (column[i] == 1){
                for (int j = 0;j < matrix.length;++j){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}

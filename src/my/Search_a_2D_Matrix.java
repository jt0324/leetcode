package my;

/**
 * Created by dean on 16/11/3.
 */
public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0]) return false;
        int low = 0,high = matrix.length - 1;
        while (low < high){
            int mid = low + (high - low)/2;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] > target) high = mid - 1;
            else{
                if (mid < high && target < matrix[mid+1][0]){
                    low = mid;
                    break;
                }
                else low = mid + 1;
            }
        }
        int line = low;
        low = 0;
        high = matrix[line].length - 1;
        while (low < high){
            int mid = low + (high - low)/2;
            if (matrix[line][mid] == target) return true;
            if(matrix[line][mid] > target) high = mid -1;
            else low = mid + 1;
        }
        return matrix[line][low] == target;
    }
}

package my;

/**
 * Created by dean on 16/10/11.
 */
public class N_Queens_II {
    int count = 0;
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];

        fun(board,0);
        return count;
    }
    public void fun(int[][] board,int col){
        if (col == board.length){
            ++count;
        }
        else{
            for (int i = 0;i < board.length; ++i){
                if (isValid(board,i,col)){
                    board[i][col] = 1;
                    fun(board,col + 1);
                    board[i][col] = 0;
                }
            }
        }
    }
    public boolean isValid(int[][] board,int x,int y){
        for (int i = 0;i < board.length; ++i){
            for (int j = 0; j < board.length; ++j){
                if (board[i][j] == 1 && (x == i || y == j || x + j == y + i || x + y == i + j)){
                    return false;
                }
            }
        }
        return true;
    }
}

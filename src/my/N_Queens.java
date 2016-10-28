package my;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by dean on 16/10/11.
 */
public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0 ;i < n; ++i){
            for (int j = 0;j < n; ++j){
                board[i][j] = '.';
            }
        }
        fun(res,board,0);
        return res;
    }
    public void fun(List<List<String>> res,char[][] board,int col){
        if (col == board.length){
            List<String> temp = new ArrayList<>();
            for (int i = 0;i < board.length; ++i){
                temp.add(new String(board[i]));
            }
            res.add(new ArrayList<>(temp));
        }
        else{
            for (int i = 0;i < board.length; ++i){
                if (isValid(board,i,col)){
                    board[i][col] = 'Q';
                    fun(res,board,col + 1);
                    board[i][col] = '.';
                }
            }
        }
    }
    public boolean isValid(char[][] board,int x,int y){
        for (int i = 0;i < board.length; ++i){
            for (int j = 0; j < board.length; ++j){
                if (board[i][j] == 'Q' && (i + j == x + y || x + j == y + i || x == i)){
                    return false;
                }
            }
        }
        return true;
    }

}

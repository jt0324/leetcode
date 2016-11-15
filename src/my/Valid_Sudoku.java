package my;

import com.sun.javafx.css.StyleableProperty;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dean on 16/11/15.
 */
public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> setRow;
        Set<Character> setCol;
        for (int i = 0;i < 9; ++i){
            setCol = new HashSet<>();
            setRow = new HashSet<>();
            for (int j = 0;j < 9; ++j){
                if (setRow.contains(board[i][j]) || setCol.contains(board[j][i])){
                    return false;
                }
                if (board[i][j] != '.')
                    setRow.add(board[i][j]);
                if (board[j][i] != '.')
                setCol.add(board[j][i]);
            }
        }
        for (int i = 0;i < 9; i += 3){
            for (int j = 0;j < 9;j += 3){
                if (!validBox(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean validBox(char[][] board,int row,int col){
        Set<Character> set = new HashSet<>();
        for (int i = row;i < row + 3;++i){
            for (int j = col;j < col + 3; ++j){
                if (set.contains(board[i][j])){
                    return false;
                }
                if (board[i][j] != '.')
                    set.add(board[i][j]);
            }
        }
        return true;
    }
}

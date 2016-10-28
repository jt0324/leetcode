package my;

/**
 * Created by dean on 16/10/11.
 */
public class Word_Search {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) return false;
        if (word == null || word.length() == 0) return true;
        for (int i = 0;i < board.length; ++i){
            for (int j = 0;j < board[0].length; ++j){
                if(fun(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean fun(char[][] board,String word,int i,int j,int start){
        if(start == word.length()) return true;
        if (i < 0 || j < 0) return false;
        if (i > board.length - 1 || j > board[0].length - 1) return false;
        if (board[i][j] != word.charAt(start)) return false;
        board[i][j] = '#';
        boolean exist = fun(board,word,i + 1,j,start + 1) ||
                fun(board,word,i - 1,j,start + 1) ||
                fun(board,word,i,j + 1,start + 1) ||
                fun(board,word,i,j - 1,start + 1);
        board[i][j] = word.charAt(start);
        return exist;
    }
}

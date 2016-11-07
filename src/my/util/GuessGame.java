package my.util;

/**
 * Created by dean on 16/11/7.
 */
public class GuessGame {

    public int guess(int num){
        if (num == 6) return 0;
        if (num < 6) return 1;
        else return -1;
    }
}

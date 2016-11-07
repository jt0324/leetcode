package my;

import my.util.GuessGame;

/**
 * Created by dean on 16/11/7.
 */
public class Guess_Number_Higher_or_Lower extends GuessGame {
    public int guessNumber(int n) {
        int low = 1,high = n;
        while (low < high){
            int mid = low + (high - low) / 2;
            if (guess(mid) == 0) return mid;
            if (guess(mid) == -1) low = mid + 1;
            else high = mid - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Guess_Number_Higher_or_Lower g = new Guess_Number_Higher_or_Lower();
        System.out.println(g.guessNumber(10));
    }
}

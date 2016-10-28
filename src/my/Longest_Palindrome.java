package my;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dean on 16/10/7.
 */
public class Longest_Palindrome {
    public int longestPalindrome(String s) {
        int sum = 0;
        char[] ch = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < ch.length; ++i){
            if (set.contains(ch[i])){
                set.remove(ch[i]);
                sum+=2;
            }else{
                set.add(ch[i]);
            }
        }
        if (set.size() > 0) sum+=1;
        return sum;
    }

    public static void main(String[] args) {
        Longest_Palindrome longest_palindrome = new Longest_Palindrome();
        System.out.println(longest_palindrome.longestPalindrome("abccccdd"));
    }
}

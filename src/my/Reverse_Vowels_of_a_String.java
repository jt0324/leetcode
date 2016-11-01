package my;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/10/31.
 */
public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        Character[] vowel = {'a','A','e','E','i','I','o','O','u','U'};
        List<Character> list = Arrays.asList(vowel);
        int count = 0;
        int[] positions = new int[s.length()];
        char[] values = new char[s.length()];
        for (int i = 0;i < s.length(); ++i){
            if (list.contains(s.charAt(i))){
                positions[count] = i;
                values[count++] = s.charAt(i);
            }
        }
        for (int i = 0;i < count; ++i){
            sb.setCharAt(positions[i],values[count - 1 - i]);
        }
        return sb.toString();
    }
}

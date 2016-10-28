package my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/10/6.
 */
public class Find_the_difference {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] t1 = t.toCharArray();
        char[] s1 = s.toCharArray();
        for (int i = 0;i < t1.length; ++i){
            if(map.containsKey(t1[i])){
                map.put(t1[i],map.get(t1[i]) + 1);
            }else{
                map.put(t1[i],1);
            }
        }
        for (int i = 0;i < s1.length; ++i){
            map.put(s1[i],map.get(s1[i]) - 1);
        }
        char res = ' ';
        for (char key : map.keySet()){
            if(map.get(key) != 0)
                res = key;
        }
        return res;
    }

    public static void main(String[] args) {
        Find_the_difference find_the_difference = new Find_the_difference();
        System.out.println(find_the_difference.findTheDifference("abcd","abcde"));
    }
}

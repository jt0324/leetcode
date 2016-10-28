package my;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/10/7.
 */
public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        if (chs.length != cht.length) return false;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < chs.length; ++i){
            if (map.containsKey(chs[i])){
                map.put(chs[i],map.get(chs[i]) + 1);
            }else {
                map.put(chs[i], 1);
            }
        }
        for (int i = 0;i < cht.length; ++i){
            if (!map.containsKey(cht[i]) || map.get(cht[i]) == 0) {
                return false;
            }
            else {
                map.put(cht[i],map.get(cht[i]) - 1);
            }
        }
        return true;
    }
}

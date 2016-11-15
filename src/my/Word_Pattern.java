package my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/11/15.
 */
public class Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        String[] strs = str.split(" ");
        if (strs.length != pattern.length()) return false;
        for (int i = 0;i < pattern.length();++i){
            if (map.containsKey(pattern.charAt(i))){
                if (map.get(pattern.charAt(i)).equals(strs[i])){
                    continue;
                }else return false;
            }else {
                if (map.containsValue(strs[i])) return false;
                map.put(pattern.charAt(i),strs[i]);
            }
        }
        return true;
    }
}

package my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/10/31.
 */
public class Roman_to_Integer {
    public int romanToInt(String s) {
        char[] nums = s.toCharArray();
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('X',10);
        map.put('C',100);
        map.put('M',1000);
        map.put('V',5);
        map.put('L',50);
        map.put('D',500);
        for (int i = 0;i < nums.length; ++i){
            if (i != nums.length - 1 && (map.get(i + 1) > map.get(i))){
                res -= map.get(i);
            }else{
                res += map.get(i);
            }
        }
        return res;
    }
}

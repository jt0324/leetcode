package my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/10/7.
 */
public class Ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        char[] m_ch = magazine.toCharArray();
        char[] r_ch = ransomNote.toCharArray();
        for (int i = 0;i < m_ch.length; ++i){
            if (map.containsKey(m_ch[i])){
                map.put(m_ch[i], map.get(m_ch[i]) + 1);
            }else {
                map.put(m_ch[i],1);
            }
        }
        for (int i = 0;i < r_ch.length; ++i){
            if (!map.containsKey(r_ch[i])) return false;
            else if(map.get(r_ch[i]) == 0) return false;
            else map.put(r_ch[i],map.get(r_ch[i]) - 1);
        }
        return true;
    }
}

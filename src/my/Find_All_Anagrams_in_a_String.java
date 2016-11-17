package my;

import java.util.*;

/**
 * Created by dean on 16/11/15.
 */
public class Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() <= p.length()) return res;
        int plen = p.length();
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < p.length(); ++i){
            if (map.containsKey(p.charAt(i))){
                map.put(p.charAt(i),map.get(p.charAt(i)) + 1);
            }else {
                map.put(p.charAt(i),1);
            }
        }
        for (int i = 0;i < s.length(); ++i){
            if (count == plen) res.add(i - plen);
            if (i >= plen &&map.containsKey(s.charAt(i - plen))){
                map.put(s.charAt(i - plen),map.get(s.charAt(i - plen)) + 1);
                if (map.get(s.charAt(i - plen)) > 0)
                    count--;
            }
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) >= 0)
                    count++;
            }

        }
        if (count == plen) res.add(s.length() - plen);
        return res;
    }

    public static void main(String[] args) {
        Find_All_Anagrams_in_a_String f = new Find_All_Anagrams_in_a_String();
        f.findAnagrams("abacbabc" ,"abc");
    }
}

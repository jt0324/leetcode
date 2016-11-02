package my;

import java.util.*;

/**
 * Created by dean on 16/11/1.
 */
public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0;i < strs.length; ++i){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            if (map.containsKey(new String(temp))){
                res.get(map.get(new String(temp))).add(strs[i]);
            }else{
                res.add(new ArrayList<String>(Arrays.asList(strs[i])));
                map.put(new String(temp),res.size() - 1);
            }
        }
        return res;
    }
}

package my;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dean on 16/10/31.
 */
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length == 0) return res;
        int len = strs[0].length();
        while (len > 0){
            res = strs[0].substring(0,len);
            boolean flag = true;
            for (int i = 1;i < strs.length; ++i){
                if (strs[i].startsWith(res) == false){
                    len--;
                    flag = false;
                    break;
                }
            }
            if (flag) break;
        }
        if(len == 0) return "";
        return res;
    }

    public static void main(String[] args) {
        Longest_Common_Prefix l = new Longest_Common_Prefix();
        l.longestCommonPrefix(new String[]{"aa","ab"});

    }
}

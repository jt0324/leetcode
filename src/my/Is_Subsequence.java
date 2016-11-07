package my;

/**
 * Created by dean on 16/11/7.
 */
public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int start = 0;
        boolean res = false;
        for (int i = 0;i < s.length(); ++i){
            while (start < t.length()){
                if (t.charAt(start++) == s.charAt(i)){
                    if (i == s.length() - 1) res = true;
                    break;
                }
            }
        }
        return res;
    }
}



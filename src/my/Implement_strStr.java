package my;

/**
 * Created by dean on 16/10/31.
 */
public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        for (int i = 0;i < haystack.length() - needle.length() + 1; ++i){
            if (haystack.substring(0,needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

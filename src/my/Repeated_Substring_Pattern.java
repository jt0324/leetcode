package my;

/**
 * Created by dean on 16/11/18.
 */
public class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for (int i = 2;i <= len; ++i){
            boolean flag = true;
            if (len % i == 0){
                int subLen = len/i;
                int start = 0;
                while (start + (2*subLen) <= len){
                    if (!str.substring(start,start + subLen).equals(str.substring(start + subLen,start + (2*subLen)))){
                        flag = false;
                        break;
                    }
                    start+=subLen;
                }
                if (flag) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Repeated_Substring_Pattern r = new Repeated_Substring_Pattern();
        String str = "bb";
        System.out.println(r.repeatedSubstringPattern(str));
    }
}

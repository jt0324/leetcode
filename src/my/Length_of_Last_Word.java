package my;

/**
 * Created by dean on 16/11/1.
 */
public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        if (s.trim().length() == 0) return 0;
        int index = s.lastIndexOf(" ");
        while (index == s.length() - 1){
            s = s.substring(0,index);
            index = s.lastIndexOf(" ");
        }
        return s.length() - index - 1;
    }
}

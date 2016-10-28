package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/12.
 */
public class Palindrome_Partitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        fun(res,new ArrayList<String>(),s);
        return res;
    }

    public void fun(List<List<String>> res,List<String> temp,String s){
        if (s.length() == 0){
            res.add(new ArrayList<>(temp));
        }
        for (int i = 0;i < s.length(); ++i){
            String str = s.substring(0,i+1);
            if (isPalindrome(str)){
                temp.add(str);
                fun(res,temp,s.substring(i+1));
                temp.remove(temp.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s){
        if (s.length() == 0) return false;
        if (s.length() == 1) return true;
        for (int i = 0 ;i < s.length()/2; ++i){
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_Partitioning p = new Palindrome_Partitioning();
        p.partition("aab");
    }
}

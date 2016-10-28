package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/12.
 */
public class Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0){
            return res;
        }
        String[] nums = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        fun(res,"",digits,nums);
        return res;
    }
    public void fun(List<String> res,String temp,String digits,String[] nums){
        if (digits.length() < 1){
            res.add(temp);
            return;
        }
        int curr = Character.getNumericValue(digits.charAt(0));
        int len = nums[curr].length();
        for (int i = 0;i < len; ++i){
            fun(res,temp+nums[curr].charAt(i),digits.substring(1),nums);
        }
    }


    public static void main(String[] args) {
        Letter_Combinations_of_a_Phone_Number le = new Letter_Combinations_of_a_Phone_Number();
        le.letterCombinations("12");
    }
}

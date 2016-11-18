package my;

/**
 * Created by dean on 16/11/18.
 */
public class Add_Strings {
    public String addStrings(String num1, String num2) {
        String res = "";
        int flag = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 && j >= 0){
            int value = (num1.charAt(i--) - '0') + (num2.charAt(j--) - '0') + flag;
            res = value%10 + res;
            flag = value/10;
        }
        while (i >= 0){
            int value = (num1.charAt(i--) - '0') + flag;
            res = value%10 + res;
            flag = value/10;
        }
        while (j >= 0){
            int value = (num1.charAt(i--) - '0') + flag;
            res = value%10 + res;
            flag = value/10;
        }
        if (flag == 1) res = 1 + res;
        return res;
    }
}

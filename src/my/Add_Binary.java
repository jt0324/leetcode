package my;

import java.util.Map;

/**
 * Created by dean on 16/10/31.
 */
public class Add_Binary {
    public String addBinary(String a, String b) {
        String res = "";
        char[] numa = a.toCharArray();
        char[] numb = b.toCharArray();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int flag = 0;
        while (lenA >= 0 && lenB >= 0){
            int sum = flag + (numa[lenA] - '0') + (numb[lenB] - '0');
            flag = sum/2;
            res = (sum % 2) + res;
            lenA--;
            lenB--;
        }
        while (lenA >= 0){
            int sum = flag + (numa[lenA] - '0');
            flag = sum/2;
            res = (sum % 2) + res;
            lenA--;
        }
        while (lenB >= 0){
            int sum = flag + (numb[lenB] - '0');
            flag = sum/2;
            res = (sum % 2) + res;
            lenB--;
        }
        if (flag == 1)
            res = 1 + res;
        return res;
    }
}

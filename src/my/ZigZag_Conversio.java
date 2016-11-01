package my;

/**
 * Created by dean on 16/10/31.
 */
public class ZigZag_Conversio {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        String res = "";
        int origin = 2 * (numRows - 1);
        for (int i = 1;i < numRows; ++i){
            int n = 2 * (numRows - i);
            for (int j = i - 1;j < s.length(); j += n){
                res += s.charAt(j);
                if (i > 1 && j > (i-1))
                    n = Math.abs(n - origin);
            }
        }
        for (int j = numRows - 1;j < s.length();j += origin){
            res += s.charAt(j);
        }
        return res;
    }

    public static void main(String[] args) {
        ZigZag_Conversio z = new ZigZag_Conversio();
        z.convert("PAYPALISHIRING",4);
    }
}

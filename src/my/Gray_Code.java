package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/11.
 */
public class Gray_Code {
    public List<Integer> grayCode(int n) {
        char[] temp = new char[n];
        for (int i = 0;i < n; ++i){
            temp[i] = '0';
        }
        List<Integer> res = new ArrayList<>();
        if (n == 0) {
            res.add(0);
            return res;
        }
        fun(res,temp,0);
        return res;
    }

    public void fun(List<Integer> res,char[] temp,int start){
        res.add(Integer.parseInt(new String(temp),2));
        for (int i = start;i < temp.length; ++i){
            temp[i] = '1';
            fun(res,temp,i + 1);
            temp[i] = '0';
        }
    }


    public static void main(String[] args) {
//        char[] temp = {'0','1','1'};
//        System.out.println(Integer.parseInt(new String(temp),2));
        Gray_Code gray_code = new Gray_Code();
        gray_code.grayCode(0);
    }
}

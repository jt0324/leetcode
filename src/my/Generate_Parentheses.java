package my;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Created by dean on 16/10/11.
 */
public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        char[] temp = new char[n*2];
        for (int i = 0;i < temp.length; ++i){
            temp[i] = '(';
        }
        fun(res,temp,0);
        return res;
    }
    public void fun(List<String> res,char[] temp,int start){
        if (isValid(temp)){
            res.add(new String(temp));
            System.out.println(new String(temp));
        }
        for (int i = start;i < temp.length; ++i){
            temp[i] = ')';
            fun(res,temp,i + 1);
            temp[i] = '(';
        }
    }
    public boolean isValid(char[] ch){
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < ch.length; ++i){
            if (ch[i] == '(')
                stack.push('(');
            else if (ch[i] == ')' && !stack.isEmpty())
                stack.pop();
            else return false;
        }
        if (stack.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        Generate_Parentheses generate_parentheses = new Generate_Parentheses();
        generate_parentheses.generateParenthesis(3);
    }
}

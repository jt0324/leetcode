package my;

import java.util.*;

/**
 * Created by dean on 16/10/31.
 */
public class Valid_Parentheses {
    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < array.length; ++i){
            if (map.containsKey(array[i])){
                stack.push(array[i]);
            }else{
                if (stack.isEmpty() || map.get(stack.pop()) != array[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

package my;

/**
 * Created by dean on 16/10/6.
 */
public class Reverse_String {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int len = s.length();
        char temp;
        for (int i = 0;i < len/2; ++i){
            temp = ch[i];
            ch[i]  = ch[len - 1 - i];
            ch[len - 1 - i] = temp;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Reverse_String reverse_string = new Reverse_String();
        System.out.println(reverse_string.reverseString("hello"));
    }
}

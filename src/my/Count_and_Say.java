package my;

/**
 * Created by dean on 16/10/31.
 */
public class Count_and_Say {
    public String countAndSay(int n) {
        String[] seq = new String[n];
        seq[0] = "1";
        for (int i = 1;i < n ; ++i){
            String str = seq[i - 1];
            String temp = "";
            for (int j = 0;j < str.length(); ++j){
                int count = 1;
                while (j < str.length() - 1 && str.charAt(j) == str.charAt(j + 1)){
                    count++;
                    j++;
                }
                temp += (count + "" + str.charAt(j));
            }
            seq[i] = temp;
        }
        return seq[n - 1];
    }
}

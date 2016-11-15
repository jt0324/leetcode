package my;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dean on 16/11/15.
 */
public class Bulls_and_Cows {
    public String getHint(String secret, String guess) {
        int bull = 0,cow = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < secret.length(); ++i){
            if (secret.charAt(i) == guess.charAt(i)){
                bull++;
                continue;
            }
            if (map.containsKey(secret.charAt(i))){
                map.put(secret.charAt(i),map.get(secret.charAt(i)) + 1);
            }else map.put(secret.charAt(i),1);
        }
        for (int i = 0;i < guess.length(); ++i){
            if (secret.charAt(i) != guess.charAt(i)){
                if (map.containsKey(guess.charAt(i)) && map.get(guess.charAt(i)) > 0){
                    cow++;
                    map.put(guess.charAt(i),map.get(guess.charAt(i)) - 1);
                }
            }

        }
        return ""+bull + 'A' + cow + 'B';
    }
}

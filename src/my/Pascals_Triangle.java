package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/21.
 */
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1;i <= numRows; ++i){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i-1; ++j){
                row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            if (i !=1){
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}

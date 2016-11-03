package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/11/2.
 */
public class Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> temping = new ArrayList<>();
        if (rowIndex == 0){
            temping.add(1);
            return temping;
        }
        temping.add(1);
        List<Integer> temp = getRow(rowIndex - 1);
        for (int i = 1;i < rowIndex - 1; ++i){
            temping.add(temp.get(i),temp.get(i + 1));
        }
        temping.add(1);
        return temping;
    }
}

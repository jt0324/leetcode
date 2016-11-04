package my;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/11/4.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] minArray = new int[triangle.size()];
        for (int i = 0;i < triangle.size(); ++i){
            int min = Integer.MAX_VALUE;
            for (int j = 0;j < triangle.get(i).size(); ++j){
                if (triangle.get(i).get(j) < min)
                    min = triangle.get(i).get(j);
            }
            if (i == 0) minArray[0] = min;
            else minArray[i] = min + minArray[i - 1];
        }

        return minArray[minArray.length - 1];
    }
}

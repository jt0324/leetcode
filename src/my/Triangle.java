package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dean on 16/11/4.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(triangle.get(0));
        for (int i = 1;i < triangle.size(); ++i){
            res.add(new ArrayList<Integer>());
            for (int j = 0;j < triangle.get(i).size(); ++j){
                if (j == 0)
                    res.get(i).add(triangle.get(i).get(j) + res.get(i - 1).get(j));
                else if(j == triangle.get(i).size() - 1)
                    res.get(i).add(triangle.get(i).get(j) + res.get(i - 1).get(j - 1));
                else
                    res.get(i).add(triangle.get(i).get(j) + Math.min(res.get(i - 1).get(j - 1),res.get(i - 1).get(j)));
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < res.get(res.size() - 1).size(); ++i){
            if (res.get(res.size() - 1).get(i) < min) min = res.get(res.size() - 1).get(i);
        }
        return min;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        List<List<Integer>> list = new ArrayList<>();
        Integer[] line2 = {2,3};
        Integer[] line3 = {1,-1,3};
        list.add(new ArrayList<Integer>(Arrays.asList(-1)));
        list.add(new ArrayList<Integer>(Arrays.asList(line2)));
        list.add(new ArrayList<Integer>(Arrays.asList(line3)));
        t.minimumTotal(list);
    }
}

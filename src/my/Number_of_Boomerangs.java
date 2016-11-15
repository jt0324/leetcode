package my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dean on 16/11/15.
 */
public class Number_of_Boomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Double,Integer> map;
        for (int i = 0;i < points.length; ++i){
            map = new HashMap<>();
            for (int j = 0;j < points.length; ++j){
                if (i == j) continue;
                double d = getDistance(points[i],points[j]);
                if (map.containsKey(d)){
                    map.put(d,map.get(d) + 1);
                }else {
                    map.put(d,1);
                }
            }
            for (int v : map.values()){
                if (v >= 2){
                    count += (v * (v - 1));
                }
            }
        }
        return count;

    }

    public double getDistance(int[] point1,int[] point2){
        int sum = 0;
        for (int i = 0;i < point1.length; ++i){
            sum += Math.pow(point1[i] - point2[i],2);
        }
        return Math.sqrt(sum);
    }
}

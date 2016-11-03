package my;

/**
 * Created by dean on 16/11/3.
 */
public class Container_With_Most_Water {

    public int maxArea(int[] height) {
        int low = 0,high = height.length - 1;
        int max = 0;
        while (low < high){
            max = Math.max(max,(high - low) * Math.min(height[low],height[high]));
            if (height[low] < height[high]) low++;
            else high--;
        }
        return max;
    }


}

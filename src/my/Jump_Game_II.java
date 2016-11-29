package my;

/**
 * Created by dean on 16/11/26.
 */
public class Jump_Game_II {
    public int jump(int[] nums) {
        int[] min = new int[nums.length];
        min[0] = 0;
        for (int i = 0;i < nums.length; ++i){
           for (int j = 1;j <= nums[i] && i + j < nums.length; ++j){
               if (min[i + j] != 0){
                   min[i + j] = Math.min(min[i + j],min[i] + 1);
               }else min[i + j] = min[i] + 1;
           }
        }
        return min[nums.length - 1];
    }
}

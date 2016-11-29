package my;

/**
 * Created by dean on 16/11/26.
 */
public class Jump_Game {
    public boolean canJump(int[] nums) {
        int max = 0;
        int len = nums.length;
        for (int i = 0;i < len; ++i){
            if (i > max) return false;
            if (max == len) return true;
            max = Math.max(max,i + nums[i]);
        }

        return true;
    }
}

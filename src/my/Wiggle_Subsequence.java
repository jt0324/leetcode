package my;

/**
 * Created by dean on 16/11/7.
 */
public class Wiggle_Subsequence {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        int count = 1;
        int[] diffs = new int[nums.length - 1];
        for (int i = 0;i < nums.length - 1; ++i){
            int diff = nums[i+1] - nums[i];
            if (diff > 0){
                diffs[i] = 1;
            }
            else if(diff < 0){
                diffs[i] = -1;
            }else diffs[i] = 0;
        }
        int start = 0;
        for (int i = 0;i < diffs.length; ++i){
            if (i == 0 && diffs[i] != 0) count++;
            else if(diffs[i] != 0 && diffs[start] != diffs[i]){
                start = i;
                count++;
            }
        }
        return count;
    }
}

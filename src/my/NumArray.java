package my;

/**
 * Created by dean on 16/10/15.
 */
public class NumArray {
    private int[] nums;
    private int[] sums;
    public NumArray(int[] nums) {
        this.nums = nums;
        this.sums = new int[nums.length];
        if (nums.length > 0)
            sums[0] = nums[0];
        for (int i = 1;i < nums.length; ++i){
            sums[i] = sums[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) return sums[j];
        return sums[j] - sums[i-1];
    }
}

package my;

/**
 * Created by dean on 16/11/2.
 */
public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        if (nums.length == 0 || nums.length == 1 || nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        for (int i = 1;i < nums.length - 1; ++i){
            if (nums[i] > nums[i-1] && nums[i] > nums[i + 1]){
                return i;
            }
        }
        return 0;
    }
}

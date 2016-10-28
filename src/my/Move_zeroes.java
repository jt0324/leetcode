package my;

/**
 * Created by dean on 16/10/6.
 */
public class Move_zeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0;i < nums.length; ++i){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for (int i = index;i < nums.length; ++i){
            nums[i] = 0;
        }

    }
}

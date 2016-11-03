package my;

/**
 * Created by dean on 16/11/3.
 */
public class Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int count = 0;
        for (int i = 0;i < nums.length - 2;++i){
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]){
                continue;
            }
            nums[count++] = nums[i];
        }
        if (nums.length > 1){
            nums[count++] = nums[nums.length - 2];
            nums[count++] = nums[nums.length - 1];
        }
        return count;
    }
}

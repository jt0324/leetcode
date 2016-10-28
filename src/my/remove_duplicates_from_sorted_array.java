package my;

/**
 * Created by dean on 16/10/21.
 */
public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0;i < nums.length-1; ++i){
            if (nums[i+1] == nums[i]){
                continue;
            }
            nums[index++] = nums[i];
        }
        if (nums.length > 0)
            nums[index++] = nums[nums.length - 1];
        return index;
    }
}

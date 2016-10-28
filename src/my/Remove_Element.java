package my;

/**
 * Created by dean on 16/10/21.
 */
public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i  = 0;i < nums.length; ++i){
            if (nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

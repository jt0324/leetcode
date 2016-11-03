package my;

/**
 * Created by dean on 16/11/2.
 */
public class Sort_Color {
    public void sortColors(int[] nums) {
        int start = 0;
        for (int i = 0;i <= 2; ++i){
            for (int j = start;j < nums.length;++j){
                if (nums[j] == i){
                    int temp = nums[start];
                    nums[start++] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

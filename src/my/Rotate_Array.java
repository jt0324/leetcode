package my;

/**
 * Created by dean on 16/11/2.
 */
public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) return;
        int[] temp = new int[k];
        for (int i = nums.length - k;i < nums.length; ++i){
            temp[i - nums.length + k] = nums[i];
        }
        for (int i = nums.length - 1;i >= k; --i){
            nums[i] = nums[i - k];
        }
        for (int i = 0;i < k; ++i){
            nums[i] = temp[i];
        }
    }

//    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//    }
//
//    public void reverse(int[] nums, int start, int end) {
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }
}

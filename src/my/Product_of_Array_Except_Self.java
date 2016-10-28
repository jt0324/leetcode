package my;

/**
 * Created by dean on 16/10/14.
 */
public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1,zeroCount = 0;
        for (int i = 0;i < nums.length; ++i){
            if (nums[i] == 0){
                zeroCount++;
            }else {
                sum *= nums[i];
            }
            if (zeroCount >= 2){
                return new int[nums.length];
            }
        }
        for (int i = 0;i < nums.length; ++i){
            if (zeroCount == 1){
                if (nums[i] == 0){
                    nums[i] = sum;
                }else {
                    nums[i] = 0;
                }
            }else {
                nums[i] = sum/nums[i];
            }
        }
        return nums;
    }
}

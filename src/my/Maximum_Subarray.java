package my;

import sun.nio.cs.ext.MacHebrew;

/**
 * Created by dean on 16/11/2.
 */
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int sum =0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(sum > 0){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            if(sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
}

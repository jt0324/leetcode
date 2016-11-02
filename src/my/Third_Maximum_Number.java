package my;

import java.util.Arrays;

/**
 * Created by dean on 16/11/1.
 */
public class Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int m = 0,n = -1,k = -1;
        for (int i = 1;i < nums.length; ++i){
            if (nums[i] >= nums[m]){
                m = i;
            }
        }
        for (int i = 0;i < nums.length; ++i){
            if (nums[i] >= secondMax && nums[i] != nums[m]){
                secondMax = nums[i];
                n = i;
            }
        }
        for (int i = 0;i < nums.length; ++i){
            if (nums[i] >= thirdMax && nums[i] != nums[m] && nums[i]!= nums[n]){
                thirdMax = nums[i];
                k = i;
            }
        }
        if (k == -1) return nums[m];
        else return thirdMax;
    }

    public static void main(String[] args) {
        Third_Maximum_Number t = new Third_Maximum_Number();
        System.out.println(t.thirdMax(new int[]{1,2,-2147483648}));
    }

}

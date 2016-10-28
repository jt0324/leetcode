package my;

import java.util.List;

/**
 * Created by dean on 16/10/13.
 */
public class Count_Numbers_with_Unique_Digits {
    int count = 0;
    public int countNumbersWithUniqueDigits(int n) {
        fun(new int[n],n,0);
        return count;
    }

    public void fun(int[] nums,int n,int start){
        if (start >= n) return;
        if (isValid(nums)){
            count++;
        }
        for (int i = 0;i <= 9; ++i){
            nums[start] = i;
            fun(nums,n,start++);
            nums[start] = 0;
        }
    }
    public boolean isValid(int[] nums){
        int[] flags = new int[nums.length];
        int start = 0;
        for (int i = 0;i < nums.length; ++i){
            if (nums[i] != 0){
                start = i;
                break;
            }
        }
        for (int i = start;i < nums.length; ++i){
            if (++flags[nums[i]] > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Count_Numbers_with_Unique_Digits count = new Count_Numbers_with_Unique_Digits();
        System.out.println(count.countNumbersWithUniqueDigits(2));
    }
}

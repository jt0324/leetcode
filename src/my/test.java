package my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by dean on 16/10/7.
 */
public class test {


    public static void main(String[] args) {
       //int[] nums = {1,2,3};
        //qpl(0,nums);
        Date date = new Date();
        System.out.println(date.getMonth());
    }
    public static void qpl(int fromIndex,int[] nums){
        if (fromIndex >= nums.length) {
            for (int i = 0;i < nums.length; ++i){
                System.out.print(nums[i]);
            }
            System.out.println("");
        }
        else {
            for (int i = fromIndex; i < nums.length; ++i){
                swap(nums,fromIndex,i);
                qpl(fromIndex + 1, nums);
                swap(nums,fromIndex,i);
            }

        }
    }
    public static void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

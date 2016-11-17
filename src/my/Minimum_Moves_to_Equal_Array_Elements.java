package my;

import java.util.Arrays;

/**
 * Created by dean on 16/11/17.
 */
public class Minimum_Moves_to_Equal_Array_Elements {
      public int minMoves(int[] nums){
          int count = 0;
          int min = Integer.MAX_VALUE;
          for (int i = 0;i < nums.length; ++i){
              if (nums[i] < min) min = nums[i];
          }
          for (int i = 0;i < nums.length; ++i){
              count += (nums[i] - min);
          }
          return count;
      }
}

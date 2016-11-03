package my;

/**
 * Created by dean on 16/11/2.
 */
public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int low = 1,high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            int count = 0;
            for (int i = 0;i < nums.length; ++i){
                if (nums[i] < mid){
                    count++;
                }
            }
            if (count <= mid) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}

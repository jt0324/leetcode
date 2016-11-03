package my;

/**
 * Created by dean on 16/11/2.
 */
public class Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int low = 0,high = nums.length - 1;
        if (nums[high] > nums[low]) return nums[low];
        while (low < high){
            int mid = low + (high - low)/2;
            if (nums[mid] < nums[high]) high = mid;
            else low = mid + 1;
        }
        return nums[low];
    }

}

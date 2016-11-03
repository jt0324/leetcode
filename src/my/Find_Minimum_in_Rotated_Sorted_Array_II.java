package my;

/**
 * Created by dean on 16/11/3.
 */
public class Find_Minimum_in_Rotated_Sorted_Array_II {
    public int findMin(int[] nums) {
        int low = 0,high = nums.length - 1;

        while (low < high){
            while (low < nums.length - 1 && nums[low] == nums[low + 1]) low++;
            while (high > 0 && nums[high] == nums[high - 1] ) high--;
            int mid = low + (high - low)/2;
            if(nums[mid] == nums[high])
            if (nums[mid] > nums[high]){
                low = mid + 1;

            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}

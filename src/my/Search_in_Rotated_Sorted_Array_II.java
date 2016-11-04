package my;

/**
 * Created by dean on 16/11/4.
 */
public class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        int low = 0,high = nums.length - 1;
        while (low < high){
            while (low < high && nums[low] == nums[low + 1]) low++;
            while (low < high && nums[high - 1] == nums[high]) high--;
            int mid = low + (high - low)/2;
            if (nums[mid] == target) return true;
            if (nums[low] < nums[mid]){
                if (nums[low] <= target && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
            if (nums[mid] < nums[high]){
                if (nums[mid] < target && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return false;
    }
}

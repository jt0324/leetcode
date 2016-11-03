package my;

/**
 * Created by dean on 16/11/3.
 */
public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int low = 0,high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == target) return mid;
            if (nums[low] <= nums[mid]){
                if (target < nums[mid] && target >= nums[low])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            if (nums[mid] <= nums[high]){
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}

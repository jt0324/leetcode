package my;

/**
 * Created by dean on 16/11/2.
 */
public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int low = 0,high = nums.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}

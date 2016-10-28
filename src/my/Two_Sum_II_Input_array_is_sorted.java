package my;

/**
 * Created by dean on 16/10/13.
 */
public class Two_Sum_II_Input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0;i < numbers.length; ++i ){
            res[0] = i + 1;
            int index = binary_search(numbers,i+1,target-numbers[i]);
            if (index != -1){
                res[1] = index;
                break;
            }
        }
        return res;
    }
    public int binary_search(int[] nums,int low,int target){
        int high = nums.length-1;
        int middle = (low + high)/2;
        while (low <= high){
            if (nums[middle] == target){
                return middle + 1;
            }
            else if(nums[middle] < target){
                low = middle + 1;
            }
            else {
                high = middle - 1;
            }
            middle = (low + high)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Two_Sum_II_Input_array_is_sorted t = new Two_Sum_II_Input_array_is_sorted();
        System.out.println(t.twoSum(new int[]{5,25,75},100)[0]);
    }
}

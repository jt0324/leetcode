package my;

/**
 * Created by dean on 16/10/15.
 */
public class House_Robber {
    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        int maxEven = 0,maxOdd = 0;
        for (int i = 0;i < nums.length; ++i){
            if(i % 2 == 0){
                maxOdd = Math.max(maxOdd + nums[i],maxEven);
            }else {
                maxEven = Math.max(maxEven + nums[i],maxOdd);
            }
        }
        return maxEven > maxOdd? maxEven:maxOdd;
    }
}

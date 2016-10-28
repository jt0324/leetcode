package my;

/**
 * Created by dean on 16/10/21.
 */
public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = 0;
        for (int i = 0 ;i < n; ++i){
            for (int j = start;j < m + i; ++j){
                if (nums2[i] > nums1[j]){
                    start++;
                    continue;
                }
                for (int k = m+ i;k > start; --k){
                    nums1[k] = nums1[k-1];
                }
                nums1[j] = nums2[i];
                break;
            }
            if (start >= m+i){
                nums1[start++] = nums2[i];
            }
        }
    }

    public static void main(String[] args) {
        Merge_Sorted_Array m = new Merge_Sorted_Array();
        m.merge(new int[]{4,0,0,0,0,0},1,new int[]{1,2,3,5,6},5);
    }
}

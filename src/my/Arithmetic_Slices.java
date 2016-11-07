package my;

/**
 * Created by dean on 16/11/7.
 */
public class Arithmetic_Slices {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3) return 0;
        int res = 0;
        int[] diff = new int[A.length - 1];
        for (int i = 0;i < A.length - 1; ++i){
            diff[i] = A[i + 1] - A[i];
        }
        int count = 1;
        for (int i = 0;i < diff.length - 1; ++i){
            if (diff[i + 1] == diff[i]){
                count++;
            }
            if (i == diff.length - 2 || diff[i + 1] != diff[i]){
                res += ((count) * (count - 1) / 2);
                count = 1;
            }
        }
        return res;
    }
}

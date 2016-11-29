package my;

/**
 * Created by dean on 16/11/29.
 */
public class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff = new int[gas.length];
        for (int i = 0;i < gas.length; ++i){
            diff[i] = gas[i] - cost[i];
        }
        int start = 0,now = 0,end = gas.length - 1,remain = 0;
        while (now <= end){
            remain += diff[now];
            now++;
            while (remain < 0 && now < end){
                remain += diff[end];
                start = end;
                end--;
            }
        }
        if (remain+diff[now] >= 0) return start;
        else return -1;
    }
}

package my;

import my.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dean on 16/10/7.
 */
public class Binary_Watch {
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        int[] times = {1,2,4,8,1,2,4,8,16,32};
        backtracking(list,times,0,num,0,0,0);
        return list;
    }
    public void backtracking(List<String> res,int[] times,int start,int n,int hour,int minute,int count){
        if (hour > 11 || minute > 59){
            return;
        }
        if (count == n){
            String hh = "" + hour;
            String mm = minute < 10 ? "0" + minute:minute + "";
            res.add(hh + ":" + mm);
            return;
        }
        for (int i = start;i < times.length; ++i){
            int newHour = 0,newMinute = 0;
            if (i < 4){
                newHour = hour + times[i];
                newMinute = minute;
            }
            else {
                newMinute = minute + times[i];
                newHour = hour;
            }
            backtracking(res,times,i + 1,n,newHour,newMinute,count + 1);
        }
    }
}

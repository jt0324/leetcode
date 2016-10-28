package my;

import org.omg.CORBA.INTERNAL;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by dean on 16/10/7.
 */
public class Intersection_of_two_arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int i = 0; i < nums1.length; ++i){
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; ++i){
            set2.add(nums2[i]);
        }
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()){
            int value = Integer.parseInt(iterator.next().toString());
            if (set1.contains(value)){
                set3.add(value);
            }
        }
        Integer[] temp = set3.toArray(new Integer[] {});
        int[] intArray = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            intArray[i] = temp[i].intValue();
        }
        return intArray;
    }
}

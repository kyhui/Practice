package src.LeetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target
 * number.
 * The function twoSum should return indices of the two numbers such that they add up to
 * the target, where index1 must be less than index2. Please note that your returned answers
 * (both index1 and index2) are not zero-based.
 */
public class TwoSum {

    Set<Integer> values;

    public TwoSum(){
        values = new HashSet<>();
    }

    public void add(int v){
        values.add(v);
    }

    public boolean find(int sum){
        for(int key: values) {
           if(values.contains(sum - key)){
               return true;
           }
        }
        return false;
    }



    public static boolean sumExistsInUnsorted(int[] v, int sum){
        Set<Integer> vSet = new HashSet<>();
        for(int i = 0; i < v.length; i++){
            int target = sum - v[i];
            if(vSet.contains(target)){
                return true;
            } else {
                vSet.add(v[i]);
            }
        }
        return false;
    }

    public static boolean sumExistsInSorted(int[] v, int sum){
        for(int i = 0; i < v.length; i++){
            if(bsearch(v, sum - v[i], i + 1) != -1){
                return true;
            }
        }
        return false;
    }

    private static int bsearch(int[] v, int key, int start){
        int L = start;
        int R = v.length - 1;
        while (L < R) {
            int M = (L + R) / 2;
            if (v[M] < key) {
                L = M+1;
            } else {
                R = M;
            }
        }
        return (L == R && v[L] == key) ? L : -1;
    }

    public static boolean sumExistsInSortedFaster(int[] v, int sum){
        int i = 0;
        int j = v.length - 1;
        while (i < j){
            if(v[i] + v[j] == sum){
                return true;
            } else if(v[i] + v[j] > sum){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

}

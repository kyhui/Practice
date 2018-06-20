package test.LeetCode;

import org.junit.Test;
import src.LeetCode.TwoSum;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by kyhui on 6/19/18.
 */
public class TwoSumTest {

    @Test
    public void testTwoSumExists(){
        int[] v = new int[]{1,2,3,4,5};
        int sum = 9;
        assertTrue(TwoSum.sumExistsInUnsorted(v, sum));
        assertTrue(TwoSum.sumExistsInSorted(v, sum));
        assertTrue(TwoSum.sumExistsInSortedFaster(v, sum));
    }


    @Test
    public void testDoesNotExist(){
        int[] v = new int []{1,2,3,4,5,6,7,8,9,10,11};
        int sum = 22;
        assertFalse(TwoSum.sumExistsInUnsorted(v, sum));
        assertFalse(TwoSum.sumExistsInSorted(v, sum));
        assertFalse(TwoSum.sumExistsInSortedFaster(v, sum));
    }

}

package test.LeetCode;

import org.junit.Test;
import src.LeetCode.ValidPalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by kyhui on 6/20/18.
 */
public class ValidPalindromeTest {

    @Test
    public void testPalindrome(){
        assertTrue(ValidPalindrome.validate("racecar"));
    }

    @Test
    public void testNonPalindrome(){
        assertFalse(ValidPalindrome.validate("test"));
    }

    @Test
    public void testNonAlphaNumericCharacters(){
        assertTrue(ValidPalindrome.validate("race!@%@$*!*(#@$car"));
    }

    @Test
    public void testEmptyString(){
        assertTrue(ValidPalindrome.validate(""));
    }
}

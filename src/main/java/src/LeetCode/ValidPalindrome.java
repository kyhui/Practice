package src.LeetCode;

/**
 * Created by kyhui on 6/20/18.
 */
public class ValidPalindrome {

    public static boolean validate(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}

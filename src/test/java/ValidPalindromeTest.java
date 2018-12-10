import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindromeEmptyString() {
        Assert.assertTrue(ValidPalindrome.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeTrue() {
        Assert.assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testIsPalindromeFalse() {
        Assert.assertFalse(ValidPalindrome.isPalindrome("race a car"));
    }
}
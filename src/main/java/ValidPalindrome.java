public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.replaceAll("\\W", "");
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(length - i - 1))) {
                return false;
            }
        }
        return true;
    }
}

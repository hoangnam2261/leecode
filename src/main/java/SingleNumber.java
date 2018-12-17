import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    /**
     * Time complexity : O(n*1)
     * Space complexity: O(n)
     */
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int element : nums) {
            if (set.contains(element)) {
                set.remove(element);
            } else {
                set.add(element);
            }
        }
        return set.iterator().next();
    }

    /**
     * Time complexity : O(n)
     * Space complexity: O(1)
     */
    public static int singleNumberXOR(int[] nums) {
        int result = 0;
        for (int element : nums) {
            result ^= element;
        }
        return result;
    }
}

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, 0);
        cache.put(1, 1);
        cache.put(2, 2);
        return climbStairs(cache, n);
    }

    public static int climbStairs(Map<Integer, Integer> cache, int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int s1 = climbStairs(cache, n - 1);
        int s2 = climbStairs(cache, n - 2);
        cache.put(n, s1 + s2);
        return s1 + s2;
    }
}

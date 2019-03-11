import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int k = n;
        if (k <= 0) {
            return false;
        }
        Set<Integer> tracks = new HashSet<>();
        tracks.add(n);
        while(k != 1) {
            k = getK(k);
            if (k == 1) {
                return true;
            }
            if (tracks.contains(k)) {
                return false;
            }
            tracks.add(k);
        }
        return true;
    }

    private static int getK(int k) {
        String m = String.valueOf(k);
        k = 0;
        for(int i = 0 ; i < m.length(); i++) {
            k += Math.pow(Character.getNumericValue(m.charAt(i)), 2);
        }
        return k;
    }
}

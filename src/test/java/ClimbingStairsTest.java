import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {
    @Test
    public void testZero() {
        assertEquals(0, ClimbingStairs.climbStairs(0));
    }

    @Test
    public void testSimple1() {
        assertEquals(1, ClimbingStairs.climbStairs(1));
    }

    @Test
    public void testSimple2() {
        assertEquals(2, ClimbingStairs.climbStairs(2));
    }

    @Test
    public void testSimple3() {
        assertEquals(3, ClimbingStairs.climbStairs(3));
    }

    @Test
    public void testSimple4() {
        assertEquals(5, ClimbingStairs.climbStairs(4));
    }
}
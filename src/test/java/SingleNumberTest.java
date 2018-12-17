import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void testSingleNumber1() {
        assertEquals(1, SingleNumber.singleNumber(new int[]{2, 2, 1}));
        assertEquals(1, SingleNumber.singleNumberXOR(new int[]{2, 2, 1}));
    }

    @Test
    public void testSingleNumber2() {
        assertEquals(4, SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(4, SingleNumber.singleNumberXOR(new int[]{4, 1, 2, 1, 2}));
    }
}
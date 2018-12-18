import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumberTest {

    @Test
    public void testUglyNumber() {
        assertFalse(UglyNumber.isUgly(0));
        assertTrue(UglyNumber.isUgly(6));
        assertTrue(UglyNumber.isUgly(8));
        assertFalse(UglyNumber.isUgly(14));
        assertTrue(UglyNumber.isUgly(1));
    }
}
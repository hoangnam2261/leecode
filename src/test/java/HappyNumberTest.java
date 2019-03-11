import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void testIsHappy() {
        assertTrue(HappyNumber.isHappy(19));
        assertFalse(HappyNumber.isHappy(-19));
        assertTrue(HappyNumber.isHappy(1));
        assertTrue(HappyNumber.isHappy(68));
        assertTrue(HappyNumber.isHappy(82));
        assertTrue(HappyNumber.isHappy(100));
        assertFalse(HappyNumber.isHappy(0));
        assertTrue(HappyNumber.isHappy(7));
        assertFalse(HappyNumber.isHappy(2));
        assertFalse(HappyNumber.isHappy(3));
    }
}
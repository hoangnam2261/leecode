import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void testRotate1() {
        //GIVEN
        int[] num = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {5,6,7,1,2,3,4};
        Assert.assertArrayEquals(expectedArray, num);
    }

    @Test
    public void testRotate2() {
        //GIVEN
        int[] num = new int[] {1,2,3,4,5,6,7};
        int k = 0;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {1,2,3,4,5,6,7};
        Assert.assertArrayEquals(expectedArray, num);
    }

    @Test
    public void testRotate4() {
        //GIVEN
        int[] num = new int[] {1,2,3,4,5,6,7};
        int k = num.length;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {1,2,3,4,5,6,7};
        Assert.assertArrayEquals(expectedArray, num);
    }

    @Test
    public void testRotate6() {
        //GIVEN
        int[] num = new int[] {1,2,3,4,5,6,7};
        int k = 8;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {7,1,2,3,4,5,6};
        Assert.assertArrayEquals(expectedArray, num);
    }

    @Test
    public void testRotate5() {
        //GIVEN
        int[] num = new int[] {1,2,3,4,5,6,7};
        int k = 6;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {2,3,4,5,6,7,1};
        Assert.assertArrayEquals(expectedArray, num);
    }

    @Test
    public void testRotate3() {
        //GIVEN
        int[] num = new int[] {-1,-100,3,99};
        int k = 2;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {3,99,-1,-100};
        Assert.assertArrayEquals(expectedArray, num);
    }

    @Test
    public void testRotate7() {
        //GIVEN
        int[] num = new int[] {-1};
        int k = 2;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {-1};
        Assert.assertArrayEquals(expectedArray, num);
    }

    @Test
    public void testRotate8() {
        //GIVEN
        int[] num = new int[] {1,2,3,4,5,6};
        int k = 11;
        //WHEN
        RotateArray.rotate(num, k);
        //THEN
        int[] expectedArray = new int[] {2,3,4,5,6,1};
        Assert.assertArrayEquals(expectedArray, num);
    }
}
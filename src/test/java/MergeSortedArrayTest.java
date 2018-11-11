import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MergeSortedArrayTest {
    @Test
    public void testBasicCase() {
        //Given
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] expected = new int[] {1,2,2,3,5,6};
        //When
        int[] actual = MergeSortedArray.merge(nums1, 3, nums2, 3);
        //Then
        assertThat(actual, is(expected));
    }
}

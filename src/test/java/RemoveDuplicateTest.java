import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class RemoveDuplicateTest {
    @Test
    public void testRemoveDuplicateNullHead() {
        assertThat(RemoveDuplicate.deleteDuplicates(null), nullValue());
    }
    @Test
    public void testRemoveDuplicate() {
        //Given
        RemoveDuplicate.ListNode head =
                new RemoveDuplicate.ListNode(1,
                        new RemoveDuplicate.ListNode(1,
                                new RemoveDuplicate.ListNode(2)));
        //When Then
        assertThat(RemoveDuplicate.deleteDuplicates(head)
                .equals(new RemoveDuplicate.ListNode(1, new RemoveDuplicate.ListNode(2))), is(true));

        //Given
        head = new RemoveDuplicate.ListNode(1,
                        new RemoveDuplicate.ListNode(1,
                                new RemoveDuplicate.ListNode(2,
                                        new RemoveDuplicate.ListNode(3,
                                                new RemoveDuplicate.ListNode(3)))));
        //When Then
        assertThat(RemoveDuplicate.deleteDuplicates(head)
                .equals(new RemoveDuplicate.ListNode(1, new RemoveDuplicate.ListNode(2, new RemoveDuplicate.ListNode(3)))), is(true));
    }
}

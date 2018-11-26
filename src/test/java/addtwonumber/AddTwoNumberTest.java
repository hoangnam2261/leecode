package addtwonumber;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AddTwoNumberTest {

    @Test
    public void testSimpleCase() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertThat(AddTwoNumber.addTwoNumbers(l1, l2).equals(expected), is(true));
    }

    @Test
    public void testTwoLinkListNotEqualLenght() {
        ListNode l1 = new ListNode(2, new ListNode(4));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(5)));
        assertThat(AddTwoNumber.addTwoNumbers(l1, l2).equals(expected), is(true));
        assertThat(AddTwoNumber.addTwoNumbers(l2, l1).equals(expected), is(true));
    }

    @Test
    public void testTwoLinkListWithSingleNode() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode expected = new ListNode(7);
        assertThat(AddTwoNumber.addTwoNumbers(l2, l1).equals(expected), is(true));
    }

    @Test
    public void testRemainNotEqualZero() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode expected = new ListNode(0, new ListNode(1));
        assertThat(AddTwoNumber.addTwoNumbers(l2, l1).equals(expected), is(true));
    }

    @Test
    public void testFailedTestCase() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9, new ListNode(9));
        ListNode expected = new ListNode(0, new ListNode(0, new ListNode(1)));
        assertThat(AddTwoNumber.addTwoNumbers(l2, l1).equals(expected), is(true));
    }
}
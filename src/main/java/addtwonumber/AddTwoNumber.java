package addtwonumber;

public class AddTwoNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1 = l1.val;
        int val2 = l2.val;
        ListNode headResult = new ListNode((val1 + val2) % 10);
        ListNode runner3 = headResult;
        ListNode runner1 = l1.next;
        ListNode runner2 = l2.next;
        int remain = (val1 + val2) / 10;
        while (runner1 != null || runner2 != null) {
            if (runner1 != null) {
                val1 = runner1.val;
                runner1 = runner1.next;
            } else {
                val1 = 0;
            }
            if (runner2 != null) {
                val2 = runner2.val;
                runner2 = runner2.next;
            } else {
                val2 = 0;
            }
            runner3.next = new ListNode((val1 + val2 + remain) % 10);
            runner3 = runner3.next;
            remain = (val1 + val2 + remain) / 10;
        }
        if (remain != 0) {
            runner3.next = new ListNode(remain);
        }
        return headResult;
    }
}

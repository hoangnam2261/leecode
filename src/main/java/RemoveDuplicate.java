import java.util.Objects;

public class RemoveDuplicate {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode runner = head;
        while (runner.next != null) {
            if (runner.val == runner.next.val) {
                ListNode tmp = runner.next;
                runner.next = runner.next.next;
                tmp.next = null;
            } else {
                runner = runner.next;
            }
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
        ListNode(int x) {
            this.val = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            ListNode temp = this;
            ListNode temp2 = listNode;
            while(temp != null && temp2 != null){
                if(temp.val != temp2.val){
                    return false;
                }
                temp = temp.next;
                temp2 = temp2.next;
            }
            return temp == temp2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
package addtwonumber;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        ListNode temp = this;
        ListNode temp2 = listNode;
        while(temp != null && temp2 != null){
            if(temp.val != temp2.val) {
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

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        ListNode head = new ListNode(0);
        head.next  = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);

        ListNode res = new Solution().mergeNodes(head);

        while (res.next != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}

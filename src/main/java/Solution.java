public class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode res = head;
        ListNode startSeq = head;
        head = head.next;
        while(head != null) {
            if(head.val != 0) {
                startSeq.val += head.val;
            }else {
                if(head.next == null){
                    startSeq.next = null;
                }else startSeq.next = head;

                startSeq = head;
            }

            head = head.next;
        }

        return res;
    }
}
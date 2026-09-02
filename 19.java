class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;

        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}
class Solution {


    public int length(ListNode head) {
        int cnt = 0;

        while(head!=null) {
            cnt++;
            head = head.next;
        }

        return cnt;
    }
   

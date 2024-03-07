package hard.addtwonumbers;

public class Solution {
    /**
     * 1ms;43.52MB
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0, number1 = 0, number2 = 0;
        ListNode head = null;
        ListNode end = null;

        while (l1 != null || l2 != null || c != 0) {
            ListNode temp = end;
            end = new ListNode(0, null);
            if (temp != null)
                temp.next = end;
            if (head == null)
                head = end;

            if (l1 == null) number1 = 0;
            else number1 = l1.val;

            if (l2 == null) number2 = 0;
            else number2 = l2.val;

            int result = number1 + number2 + c;
            end.val = result % 10;
            c = result / 10;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return head;
    }
}

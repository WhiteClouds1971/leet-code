package hard.addtwonumbers;

import java.util.Arrays;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * <p>
 * 示例 2：
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * <p>
 * 示例 3：
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 * <p>
 * 提示：
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */

public class AddTwoNumbers {
    public void printListNode(ListNode l) {
        System.out.print("[");
        while (l != null) {
            System.out.print(l.val);
            if (l.next != null)
                System.out.print(",");
            l = l.next;
        }
        System.out.println("]");
    }

    public ListNode setListNode(int[] l1) {
        ListNode head = null;
        ListNode end = null;

        for (int i : l1) {
            ListNode temp = end;
            end = new ListNode(i, null);
            if (temp != null)
                temp.next = end;

            if (head == null)
                head = end;

        }
        return head;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Solution solution = new Solution();
        addTwoNumbers.printListNode(
                solution.addTwoNumbers(
                        addTwoNumbers.setListNode(new int[]{2, 4, 3}),
                        addTwoNumbers.setListNode(new int[]{5, 6, 4})
                )
        );
        addTwoNumbers.printListNode(
                solution.addTwoNumbers(
                        addTwoNumbers.setListNode(new int[]{0}),
                        addTwoNumbers.setListNode(new int[]{0})
                )
        );
        addTwoNumbers.printListNode(
                solution.addTwoNumbers(
                        addTwoNumbers.setListNode(new int[]{9, 9, 9, 9, 9, 9, 9}),
                        addTwoNumbers.setListNode(new int[]{9, 9, 9, 9})
                )
        );
    }
}

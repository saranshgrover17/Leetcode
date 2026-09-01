/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        // ArrayList<Integer> list = new ArrayList<>();
        ListNode prev = head;
        ListNode temp = head.next;
        int count = 1;
        int first = Integer.MAX_VALUE;
        int last = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int crcount = 0;
        int mover = 0;

        while (temp.next != null) {
            count++;
            if ((temp.val > prev.val && temp.val > temp.next.val) || (temp.val < prev.val && temp.val < temp.next.val)) {
                if (first == Integer.MAX_VALUE) {
                    first = count;
                    last = count;
                } else {
                    mover = last;
                    last = count;
                    min = Math.min(min , last - mover );
                }
                crcount++;
            }
            prev = temp;
            temp = temp.next;
        }
        if (crcount < 2) {
            return new int[]{-1, -1};
        }
        if (crcount == 2) {
            return new int[]{min, min};
        }
        return new int[]{min, last - first};
    }
}
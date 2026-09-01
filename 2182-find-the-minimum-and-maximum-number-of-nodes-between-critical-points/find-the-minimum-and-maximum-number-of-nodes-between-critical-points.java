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
        if(head==null || head.next == null || head.next.next == null){
            return new int[]{-1,-1};
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode prev = head;
        ListNode temp = head.next;
        int count = 1;
        while(temp.next!=null){
            count++;
            if((temp.val>prev.val && temp.val>temp.next.val)||(temp.val<prev.val && temp.val<temp.next.val)){
                list.add(count);
            }
            prev = temp;
            temp = temp.next;
        }
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        if(list.size()==2){
            return new int[]{list.get(1)-list.get(0),list.get(1)-list.get(0)};
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < list.size() ; i++){
            min = Math.min(min, list.get(i)-list.get(i-1));
        }
        return new int[]{min , list.get(list.size()-1)-list.get(0)};
    }
}
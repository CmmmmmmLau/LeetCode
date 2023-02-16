package Array.$206_Reverse_Linked_List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        ListNode ref = head;

        while (ref != null) {
            ListNode next = ref.next;
            ref.next = reverse;
            reverse = ref;
            ref = next;
        }

        return reverse;
    }
}
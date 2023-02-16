package Array.$21_Merge_Two_Sorted_Lists;

public class solution1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode ref = head;

        while (list1.next != null && list2.next != null) {
            if (list1.val <= list2.val) {
                ref.next = list1;
                list1 = list1.next;
            } else {
                ref.next = list2;
                list2 = list2.next;
            }
            ref = ref.next;
        }

        ref.next = list1 == null ? list2 : list1;
        return head.next;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


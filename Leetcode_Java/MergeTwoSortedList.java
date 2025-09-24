class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode val = temp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                val.next = list1;
                list1 = list1.next;
            } else {
                val.next = list2;
                list2 = list2.next;
            }
            val = val.next;
        }
        if (list1 != null) val.next = list1;
        if (list2 != null) val.next = list2;

        return temp.next;

    }
}

/*
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []*/

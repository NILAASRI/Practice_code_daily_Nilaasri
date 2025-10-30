// Remove Duplicates from Sorted List
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = head;
        while(a != null && a.next != null){
            if(a.val == a.next.val){
                a.next = a.next.next;
            }
            else
                a = a.next;
        }
        return head;
    }
}

/*
Input: head = [1,1,2]
Output: [1,2]
*/

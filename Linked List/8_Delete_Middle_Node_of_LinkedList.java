class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head.next==null) return null;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode ahead = slow.next;
        ListNode temp=head;
        while(temp.next!=slow)
        {
            temp = temp.next;
        }
        temp.next = ahead;
        return head; 
        
    }
}
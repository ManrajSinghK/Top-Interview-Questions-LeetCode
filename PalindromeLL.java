class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        ListNode fast = head;
        ListNode slow = head;
        
        while( fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow = reverse(slow);
        fast = head;
        
        while(slow != null)
        {
            if ( slow.val != fast.val)
            {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    
    public ListNode reverse( ListNode head )
    {
        ListNode prev = null;
        while(head != null)
        {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
    

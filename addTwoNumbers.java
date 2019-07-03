/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      int a=0,b=0,carry=0;
      ListNode l3cur  = new ListNode(0);
      ListNode l3head = l3cur;
      ListNode l2cur  = new ListNode(0);
      ListNode l1cur  = new ListNode(0);
      //l1cur ref to l1,l2cur ref to l2
      l1cur.val = l1.val;
      l1cur.next = l1.next;
      l2cur.val = l2.val;
      l2cur.next = l2.next;
      
      //looply add
      while(l1cur != null || l2cur != null || carry>0){
        a = (l1cur != null) ? l1cur.val : 0;
        b = (l2cur != null) ? l2cur.val : 0;
        l3cur.val = (a + b + carry) % 10;
        carry= (a+b+carry)/10;
        
        // link l3
        if(l1cur != null ){
          if(l1cur.next != null){
            l1cur = l1cur.next;
          }else{
            l1cur = null;
          }
        }  
        if(l2cur != null){
          if(l2cur.next != null){
            l2cur = l2cur.next;
          }else{
            l2cur = null;
          }
        }
        if(l1cur!=null ||l2cur !=null ||carry>0){
          l3cur.next = new ListNode(0);
          l3cur = l3cur.next;
        }
        
      }
      
      return l3head;
    }
}
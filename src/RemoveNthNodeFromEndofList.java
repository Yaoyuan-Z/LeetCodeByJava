/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */


public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp !=null){
            count ++;
            temp = temp.next;
        }
        if(count == 1){
            return null;
        }
        temp = head;
        if(n == count){
            return head.next;
        }
        for(int i = 0; i<count - n-1; i++){
            temp = temp. next;
        }

        temp.next = temp.next.next;


        return head;


    }

}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode temp1 = temp;
        ListNode temp2 = temp;
        for(int i =0;i<=n;i++){
            temp1 = temp1.next;
        }
        while(temp1!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return temp.next;
    }
}

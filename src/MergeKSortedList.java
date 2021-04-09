class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode result = new ListNode();
        if(lists.length == 0){
            return null;
        }
        result = mergeTwoLists(lists[0],null);
        for(int i = 1;i<lists.length;i++){
            ListNode temp = result;
            result = mergeTwoLists(temp,lists[i]);
        }
        return result;
    }
    
    ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode head =new ListNode();
        ListNode temp = head;
        while(l1!=null && l2 !=null){
            if(l1.val < l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }else{
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while(l1!=null){
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2!=null){
            temp.next = l2;
            temp = temp.next;
            l2= l2.next;
        }
        return head.next;
    }
}

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode temp = head;
        int res = 0;
        while (l1 != null && l2 != null) {
            int value = (l1.val + l2.val + res) % 10;
            res = l1.val + l2.val + res - 10 >= 0 ? 1 : 0;
            ListNode newNode = new ListNode(value, null);
            temp.next = newNode;
            temp = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (res != 0 && l1 != null) {

                int value = l1.val + res;
                res = value >= 10 ? 1 : 0;
                l1.val = value % 10;
                System.out.println(l1.val + " " + res);
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l1;

        }
        if (l2 != null) {
            while (res != 0 && l2 != null) {

                int value = l2.val + res;
                res = value >= 10 ? 1 : 0;
                l2.val = value % 10;
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
            temp.next = l2;
        }
        if (res == 1) {
            temp.next = new ListNode(1, null);
        }


        head = head.next;
        return head;
    }


}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }



}
package com.juniors.leetcode.linkedlist;

/**
 * @author Juniors
 * @date 2021/10/23 16:50
 */
public class Remove19 {

    public ListNode removeNthFromEnd1(ListNode head, int n) {

        ListNode fast = head, slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null){
            return head.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pre = head, p = head;
        int i = 0;
        n++;
        if(p.next == null){
            return null;
        }
        while (p.next != null){
            p = p.next;
            i++;
            if (i >= n){
                pre = pre.next;
            }
        }
        pre.next = pre.next.next;
        return head;
    }
}

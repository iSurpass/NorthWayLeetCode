package com.juniors.leetcode.linkedlist;

/**
 * 21. 合并两个有序链表
 *
 * @author Juniors
 * @date 2021/10/23 17:38
 */
public class Merge21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return null;
        }

        if (l2 == null){
            return null;
        }

        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
    }
}

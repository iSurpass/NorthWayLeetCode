package com.juniors.leetcode.linkedlist;

import java.util.List;

/**
 * 24. 两两交换链表中的节点
 *
 * 解递归题的三部曲：
 *
 * 1.找整个递归的终止条件：递归应该在什么时候结束？
 * 2.找返回值：应该给上一级返回什么信息？
 * 3.本级递归应该做什么：在这一级递归中，应该完成什么任务？
 *
 * @author Juniors
 * @date 2021/10/24 18:53
 */
public class swapairs24 {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode resultNode = swapPairs(head.next.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = resultNode;
        return headNext;
    }
}

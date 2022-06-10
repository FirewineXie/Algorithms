package com.category.linked;


import java.util.List;
import java.util.Stack;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question234
 * @createTime 2022年06月09日 21:52:28
 * @Description TODO 明天完成 快慢指针的方法
 */
public class Question234 {
    static class ListNode {
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

    private ListNode frontPointer;

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }


    //  使用快慢指针
    public boolean isPalindrome1(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;

        ListNode next = head;

        while (next.next != null && next.next.next != null) {
            next = next.next.next;
            slow = slow.next;
        }

        // 翻转 slow
        ListNode listNode = reverseList(slow.next);

        // 判断回文
        ListNode p1 = head;
        ListNode p2 = listNode;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 还原链表并返回结果
        slow.next = reverseList(listNode);
        return result;

    }

    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}

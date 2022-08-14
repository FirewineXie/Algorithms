package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 合并两个有序链表
 * @Create : 2019-02-22-15:43
 * @Description : 并且按照从大到小排序，，而且不 准新建一个链表
 */
public class 合并两个有序链表 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    /**
     * 判断链表的长度
     *
     * @param head
     * @return
     */
    public int lengthLists(ListNode head) {

        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    /**
     * 将比对好的链表都插入到链表1中
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;
    }
    public void printList(ListNode l1){

        while (l1 != null){
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
    }
    public static void main(String[] args) {
        合并两个有序链表 aa = new 合并两个有序链表();

        ListNode a = null;

        a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(4);

        ListNode b = null;

        b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);

        aa.printList(aa.mergeTwoLists(a,b));

    }

}


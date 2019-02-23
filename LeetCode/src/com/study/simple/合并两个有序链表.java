package com.study.simple;

import java.util.List;

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
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        int length1 = 0;
        int length2 = 0;

        //头指针的插入，，首数字要先进行判断,所有数字合成到那个链表中
        if (l1.val > l2.val){
            insertLists(l2,length2+1,l1.val);

            l2 = getListNode(l2, l1, length2, length1);

            return l2;
        }else {

            insertLists(l1,length1+1,l2.val);

            l1 = getListNode(l1, l2, length1, length2);

            return l1;
        }


    }

    private ListNode getListNode(ListNode l1, ListNode l2, int length1, int length2) {
        while ((l1 != null) || (l2 != null)){

            //上面已经破案首链了，，所以下面先进行下个链
            l1 = l1.next;
            length1++;
            l2 = l2.next;
            length2++;

            //现在是插入到l2 中，，所以要记录
            if (l1.val > l2.val){
                //将大的插入到后面
                insertLists(l1,length1+1,l2.val);
            }else {
                //
                insertLists(l1,length1+1,l2.val);
            }
        }
        return l1;
    }

    public ListNode insertLists(ListNode l1, int index , int value){

        for (int i=0; i < index ;i++){
            l1 = l1.next;
        }
        // 链表后面的链
        ListNode temp ;
        temp = l1.next.next;

        //让链表后面都为空
        l1.next.next = null;

        //将值加到后面
        l1.next.val =value;

        //将后面的链，连接上
        l1.next.next.next = temp;

        return l1;

    }
    public static void main(String[] args) {
        合并两个有序链表 aa = new 合并两个有序链表();

        ListNode a = null;

        a = new ListNode(1);
        a = new ListNode(2);
        a = new ListNode(4);

        ListNode b = null;

        a = new ListNode(1);
        a = new ListNode(3);
        a = new ListNode(4);

        aa.mergeTwoLists(a, b);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

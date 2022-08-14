package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 删除链表中的节点 .java
 * @Create : 2019-04-17-18:10
 * @Description :
 */
public class 删除链表中的节点 {


    public void deleteNode(ListNode node) {


        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static void main(String[] args) {

        删除链表中的节点 a = new 删除链表中的节点();
        ListNode aa = new ListNode(4);

        aa.next = new ListNode(5);
        aa.next.next = new ListNode(1);
        aa.next.next.next = new ListNode(9);

        a.deleteNode(aa);
    }

}

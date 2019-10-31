package com.study.simple;

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


    public void deleteNode(ListNode1 node) {


        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static void main(String[] args) {

        删除链表中的节点 a = new 删除链表中的节点();
        ListNode1 aa = new ListNode1(4);

        aa.next = new ListNode1(5);
        aa.next.next = new ListNode1(1);
        aa.next.next.next = new ListNode1(9);

        a.deleteNode(aa);
    }

}
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) { val = x; }
}
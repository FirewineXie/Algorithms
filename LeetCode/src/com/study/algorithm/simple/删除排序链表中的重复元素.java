package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 删除排序链表中的重复元素
 * @Create : 2020/3/3
 * @Description : 83
 */
public class 删除排序链表中的重复元素 {



    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode deleteDuplicates(ListNode head) {

      // 已经定义好了是排序链表，那么只需要一个指针就可以判定了
        ListNode tmp = head ;

        while (tmp != null && tmp.next != null){

          if (tmp.next.val == tmp.val){
              tmp.next = tmp.next.next;
          }else {
              tmp =tmp.next;
          }
        }
        return head;
    }

    public static void main(String[] args) {
        删除排序链表中的重复元素 a = new 删除排序链表中的重复元素();
        ListNode aa = new ListNode(1);

        aa.next = new ListNode(1);
        aa.next.next = new ListNode(2);
        aa.next.next.next = new ListNode(3);
        aa.next.next.next.next = new ListNode(3);

        ListNode bb = a.deleteDuplicates(aa);

        System.out.println("答案");
        while (bb != null){
            System.out.printf("%d ",bb.val);
            bb = bb.next;
        }
    }
}


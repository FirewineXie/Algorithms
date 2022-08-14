package com.study.algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 链表的中间结点
 * @Create : 2020/3/23
 * @Description :
 */
public class 链表的中间结点 {

    public ListNode middleNode(ListNode head) {

        List<Integer> result = new ArrayList<>();
        ListNode tmp = head;
        while (tmp != null){

            result.add(tmp.val);
            tmp = tmp.next;
        }
        int value = result.size()/2;
        if (value == 0){
            int i = 0;
            while (i <value-1){
                head = head.next;
                i++;
            }
            return head;
        }else {
            int i = 0;
            while (i < value){
                head = head.next;
                i++;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        链表的中间结点 a = new 链表的中间结点();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(a.middleNode(head).val);
    }
}

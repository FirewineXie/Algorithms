package com.category.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question83Test
 * @createTime: 2022年06月07日 09:42:24
 * @Description TODO
 */
class Question83Test {

    @Test
    void deleteDuplicates() {
        Question83 question83 = new Question83();
        Question83.ListNode list1 = new Question83.ListNode(1);
        Question83.ListNode list11 = new Question83.ListNode(1);
        Question83.ListNode list111 = new Question83.ListNode(1);
        //Question83.ListNode list111 = new Question83.ListNode(3);
        //Question83.ListNode list2 = new Question83.ListNode(3);
        //Question83.ListNode list3 = new Question83.ListNode(4);


        list11.next = list111;
        list1.next = list11;
        Question83.ListNode listNode = question83.deleteDuplicates(list1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
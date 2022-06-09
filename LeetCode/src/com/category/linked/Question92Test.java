package com.category.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question92Test
 * @createTime: 2022年06月09日 14:22:34
 * @Description TODO
 */
class Question92Test {

    @Test
    void reverseBetween() {


        Question92 question92 = new Question92();
        Question92.ListNode list1 = new Question92.ListNode(1);
        Question92.ListNode list2 = new Question92.ListNode(2);
        Question92.ListNode list3 = new Question92.ListNode(3);
        Question92.ListNode list4 = new Question92.ListNode(4);
        Question92.ListNode list5 = new Question92.ListNode(5);


        list4.next = list5;
        list3.next = list4;
        list2.next = list3;
        list1.next = list2;

        question92.reverseLinkedList(list1);
    }
}
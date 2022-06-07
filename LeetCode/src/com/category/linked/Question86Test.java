package com.category.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question86Test
 * @createTime 2022年06月07日 19:44:05
 * @Description TODO
 */
class Question86Test {

    @Test
    void partition() {
        Question86 question86 = new Question86();
        Question86.ListNode list1 = new Question86.ListNode(1);
        Question86.ListNode list2 = new Question86.ListNode(2);
        Question86.ListNode list3 = new Question86.ListNode(3);
        Question86.ListNode list4 = new Question86.ListNode(4);
        Question86.ListNode list5 = new Question86.ListNode(5);
        Question86.ListNode list22 = new Question86.ListNode(2);

        list5.next = list2;
        list22.next = list5;
        list3.next = list22;
        list4.next = list3;
        list1.next = list4;

        question86.partition(list1, 3);
    }
}
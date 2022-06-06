package com.category.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question82Test
 * @createTime: 2022年06月06日 20:26:24
 * @Description TODO
 */
class Question82Test {

    @Test
    void deleteDuplicates() {

        Question82 question82 = new Question82();
        Question82.ListNode list1 = new Question82.ListNode(1);
        Question82.ListNode list11 = new Question82.ListNode(1);
        Question82.ListNode list111 = new Question82.ListNode(1);
        Question82.ListNode list2 = new Question82.ListNode(2);
        Question82.ListNode list3 = new Question82.ListNode(3);

        list2.next = list3;
        list111.next = list2;
        list11.next = list111;
        list1.next = list11;
        question82.deleteDuplicates(list1);
    }
}
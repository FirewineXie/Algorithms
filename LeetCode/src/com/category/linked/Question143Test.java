package com.category.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question143Test
 * @createTime 2022年06月11日 11:49:13
 * @Description TODO
 */
class Question143Test {

    @Test
    void reorderList() {
        Question143 question234 = new Question143();
        Question143.ListNode list1 = new Question143.ListNode(1);
        Question143.ListNode list2 = new Question143.ListNode(2);
        Question143.ListNode list3 = new Question143.ListNode(3);
        Question143.ListNode list4 = new Question143.ListNode(4);




        list3.next = list4;
        list2.next = list3;
        list1.next = list2;

        question234.reorderList(list1);
        System.out.println(list1);
    }
}
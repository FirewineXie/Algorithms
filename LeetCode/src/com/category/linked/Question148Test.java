package com.category.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question148Test
 * @createTime 2022年06月11日 11:02:19
 * @Description TODO
 */
class Question148Test {

    @Test
    void sortList() {
        Question148 question234 = new Question148();
        Question148.ListNode list1 = new Question148.ListNode(1);
        Question148.ListNode list2 = new Question148.ListNode(2);
        Question148.ListNode list3 = new Question148.ListNode(3);
        Question148.ListNode list4 = new Question148.ListNode(4);




        list3.next = list4;
        list2.next = list3;
        list1.next = list2;

        Question148.ListNode listNode = question234.sortList(list1);
        System.out.println(listNode);
    }
}
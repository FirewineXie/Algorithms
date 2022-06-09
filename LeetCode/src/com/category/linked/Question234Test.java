package com.category.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question234Test
 * @createTime 2022年06月09日 21:56:59
 * @Description TODO
 */
class Question234Test {

    @Test
    void isPalindrome() {
        Question234 question234 = new Question234();
        Question234.ListNode list1 = new Question234.ListNode(1);
        Question234.ListNode list2 = new Question234.ListNode(2);
//        Question234.ListNode list3 = new Question234.ListNode(1);
//        Question234.ListNode list4 = new Question234.ListNode(1);




//        list3.next = list4;
//        list2.next = list3;
        list1.next = list2;

        System.out.println(question234.isPalindrome(list1));
    }
}
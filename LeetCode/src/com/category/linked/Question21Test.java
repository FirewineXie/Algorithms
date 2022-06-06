package com.category.linked;

import org.junit.jupiter.api.Test;


/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question21Test
 * @createTime: 2022年06月06日 19:45:22
 * @Description TODO
 */
class Question21Test {

    @Test
    void mergeTwoLists() {


        Question21 question21 = new Question21();

        Question21.ListNode list1 = new Question21.ListNode(1);
        Question21.ListNode list11 = new Question21.ListNode(1);
        Question21.ListNode list2 = new Question21.ListNode(2);
        Question21.ListNode list4 = new Question21.ListNode(4);
        Question21.ListNode list3 = new Question21.ListNode(3);

        list2.next = list4;
        list11.next = list2;

        list3.next = list4;
        list1.next = list3;
        question21.mergeTwoLists(list11,list1 );
    }
}
package com.item.structer;


import org.junit.Test;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz24Test
 * @createTime 2022年08月25日 08:39:43
 * @Description TODO
 */
public class Jz24Test {

    @Test
    public void reverseList2() {
        Jz24 jz24 = new Jz24();

        Jz24.ListNode root = new Jz24.ListNode(1);
        root.next = new Jz24.ListNode(2);
        root.next.next = new Jz24.ListNode(3);
        jz24.ReverseList2(root);
    }
}
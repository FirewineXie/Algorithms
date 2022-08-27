package com.item.structer;

import org.junit.Test;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz22Test
 * @createTime 2022年08月26日 16:32:32
 * @Description TODO
 */
public class Jz22Test {

    @Test
    public void findKthToTail() {

        Jz22 jz22 = new Jz22();

        Jz22.ListNode root = new Jz22.ListNode(1);
        root.next = new Jz22.ListNode(2);
        root.next.next = new Jz22.ListNode(3);
        root.next.next.next = new Jz22.ListNode(4);
        root.next.next.next.next = new Jz22.ListNode(5);

        jz22.FindKthToTail(root, 2);
    }
}
package com.item.structer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz25Test
 * @createTime 2022年08月25日 08:50:10
 * @Description TODO
 */
public class Jz25Test {

    @Test
    public void merge() {
        Jz25 jz25 = new Jz25();


        Jz25.ListNode root1 = new Jz25.ListNode(1);
        root1.next = new Jz25.ListNode(3);
        root1.next.next = new Jz25.ListNode(5);
        Jz25.ListNode root2 = new Jz25.ListNode(2);
        root2.next = new Jz25.ListNode(4);
        root2.next.next = new Jz25.ListNode(6);

        jz25.Merge(root1, root2);
    }
}
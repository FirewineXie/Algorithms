package com.item.structer;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz22
 * @createTime 2022年08月26日 14:59:24
 * @Description TODO
 */
public class Jz22 {

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param pHead ListNode类
     * @param k     int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail(ListNode pHead, int k) {

        if (pHead.next == null) {
            return pHead;
        }
        ListNode pLink = pHead;

        int sum = 0;

        while (pHead != null) {

            sum++;
            pHead = pHead.next;
            if (k == sum) {
                pLink = pLink.next;
                sum = 0;
            }
        }

        if (sum < k) {
            return null;
        }

        return pLink;

    }

}

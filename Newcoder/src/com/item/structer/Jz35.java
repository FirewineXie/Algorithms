package com.item.structer;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Jz35
 * @createTime 2022年08月27日 19:20:23
 * @Description TODO
 */
public class Jz35 {
    static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode copyNode = new RandomListNode(cur.label);
            copyNode.next = cur.next;
            cur.next = copyNode;
            cur = cur.next.next;
        }
        cur = pHead;
        while (cur != null) {
            if (cur.random != null) cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        cur = pHead;
        RandomListNode copyHead = cur.next, temp = copyHead;
        while (cur != null) {
            if (cur.next != null) {
                cur.next = cur.next.next;
                cur = cur.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                temp = temp.next;
            }
        }
        return copyHead;
    }
}

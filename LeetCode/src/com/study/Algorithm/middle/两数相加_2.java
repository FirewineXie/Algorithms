package com.study.Algorithm.middle;


/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName 两数相加_2.java
 * @createTime: 2021年04月08日 09:30:20
 * @Description TODO
 */
public class 两数相加_2 {


    public static void main(String[] args) {
        两数相加_2 c = new 两数相加_2();
        ListNode t1 = new ListNode(9);
        ListNode t2 = new ListNode(9);

        t1.next = new ListNode(9, new ListNode(9,new ListNode(9)));
        t2.next = new ListNode(9, new ListNode(9));

        System.out.println(c.addTwoNumbers(t1, t2));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        ListNode result = l3;
        //进位
        int temp = 0;

        while (true) {


            // 两个链的数值 和进位数值
            int val = temp;
            temp = 0;
            if (l1 != null) {
                val += l1.val;
                if (l1.next != null) {
                    l1 = l1.next;
                }else{
                    l1 = null;
                }
            }
            if (l2 != null) {
                val += l2.val;
                if (l2.next != null) {
                    l2 = l2.next;
                }else {
                    l2 = null;
                }
            }

            int d = val % 10;;
            if (val >= 10) {
                int i = val / 10;


                temp = i;


            }
            l3.val = d;
            if (l1 != null || l2 != null || temp != 0){
                l3.next = new ListNode();
                l3 = l3.next;
            }

            if (l1 == null && l2 == null && temp == 0){
                break;
            }


        }

        return result;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
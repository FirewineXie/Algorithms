package com.basic.example;


import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: BagExam .java
 * @Create : 2019-02-23-15:37
 * @Description :
 */
public class BagExam<Item>  implements Iterable<Item> {

    //链表的首节点
    private Node first;

    private class Node{
        Item item;
        Node next;
    }
    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator1();
    }
    private class ListIterator1 implements Iterator<Item>{
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }
        @Override
        public void remove(){}

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}

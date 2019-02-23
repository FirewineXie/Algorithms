package com.basic.example;

import javax.xml.soap.Node;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: StackExam .java
 * @Create : 2019-02-23-15:22
 * @Description : 利用链表实现
 */
public class StackExam<Item> {
    //栈顶
    private Node first;

    //元素数量
    private int N;

    private class Node{
        //定义了节点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty(){return first == null;}
    public int size(){return  N;}
    public void push(Item item){
        //添加元素
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    public Item pop(){
        //栈顶删除元素
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }


}

package com.basic.example;

import javax.xml.soap.Node;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: QueueExam .java
 * @Create : 2019-02-23-15:29
 * @Description :
 */
public class QueueExam <Item>{

    //最早添加的结点的连接
    private Node first ;

    //指向最近添加的结点的连接
    private Node last;

    // 队列中的元素数量
    private int N;

    private class Node{
        //定义了节点的嵌套类
        Item item;
        Node next;

    }
    public boolean isEmpty(){return first == null;}
    public int size(){
        return N;
    }

    public void enqueue(Item item){
        Node oldlast = last;
        last.item = item;
        last.next = null;
        if (isEmpty()){
            first = last;
        }else {
            oldlast.next = last;
        }
    }
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if (isEmpty()){
            last =null;

        }
        N--;
        return item;
    }

}

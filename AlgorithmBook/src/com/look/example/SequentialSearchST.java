package com.look.example;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.xml.soap.Node;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: SequentialSearchST .java
 * @Create : 2019-03-30-17:16
 * @Description :
 */
public class SequentialSearchST<Key , Value> {

    private Node first;
    private class  Node {
        Key key;
        Value value;
        Node next;

        public Node (Key key, Value value , Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public  Value get(Key key){
        for (Node x = first; x != null; x = x.next){
            if (key.equals(x.key)){
                return x.value;
            }
        }
        return null;
    }
    public void put(Key key, Value value){
         for (Node x = first; x != null; x = x.next){
             if (key.equals(x.key)){
                 x.value = value;
                 return;
             }

         }
         first = new Node(key,value,first);
    }

}

package com.structure.stactorqueue.stack;



/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: ArrayStack
 * @Create : 2020/3/2
 * @Description :
 */
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;
    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array<>();
    }
    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public void push(E o) {
        array.addLast(o);

    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        res.append("Stack : ");
        res.append("[");
        for (int i = 0 ; i < array.getSize() ; i++){
            res.append(array.get(i));
            if (i != array.getSize() -1){
                res.append(",");
            }

        }
        res.append("] top");
        return res.toString();
    }
}

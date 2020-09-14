package com.structure.第2章_栈和队列.stack;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: Stack
 * @Create : 2020/3/2
 * @Description :
 */
public interface Stack<E> {

    /**
     * @return
     */
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}

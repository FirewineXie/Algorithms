package com.study.algorithm.simple;

import java.util.Stack;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName 用栈实现队列_232.java
 * @createTime: 2021年04月09日 15:14:55
 * @Description TODO
 */
public class 用栈实现队列_232 {

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        // obj.push(3);
        // obj.push(4);
        System.out.println(obj.peek());
        // obj.push(5);
        // System.out.println(obj.pop());
        // System.out.println(obj.pop());
        // System.out.println(obj.pop());
        // System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}

class MyQueue {

    private final Stack<Integer> stack;
    private final Stack<Integer> stack1;


    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();
        stack1 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {

        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {


        if (!stack.empty() && stack1.empty()) {
            int size = stack.size();
            for (int i = 1; i < size; i++) {
                stack1.push(stack.pop());
            }

            return stack.pop();
        }
        return stack1.pop();

    }

    /**
     * Get the front element.
     */
    public int peek() {

        if (!stack.empty() && stack1.empty()) {
            int size = stack.size();
            for (int i = 1; i <= size; i++) {
                stack1.push(stack.pop());
            }
        }

        if (stack.empty() && stack1.empty()) {
            return 0;
        }
        return stack1.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {

        return stack1.empty() && stack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
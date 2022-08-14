package com.study.algorithm.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 用队列实现栈
 * @Create : 2020/3/1
 * @Description :
 *  题目 225 ，使用队列，实现栈的操作，，，
 */
public class 用队列实现栈 {


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.empty());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}
class MyStack {

    private List<Integer> stack;
    /** Initialize your data structure here. */
    public MyStack() {
        //使用list 来进行模拟栈
       stack = new ArrayList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {

        stack.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        return stack.remove(stack.size()-1);
    }

    /** Get the top element. */
    public int top() {
        return stack.get(stack.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

        if (stack.size() == 0){
            return true;
        }else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
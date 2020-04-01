package com.study.Algorithm.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 面试题59II_队列的最大值
 * @Create : 2020/3/7
 * @Description :
 * 标签 ; 栈 ，sliding Window
 */
public class 面试题59II_队列的最大值 {


    public static void main(String[] args) {
        String[] input = new String[]{"MaxQueue","push_back","push_back","max_value","pop_front","max_value"};


//"push_back","max_value","push_back","max_value"]
//[[],[],[],[],[],[],[15],[],[9],[]]
        MaxQueue obj = new MaxQueue();

        obj.push_back(15);
        int pararm_1 = obj.max_value();
        System.out.println(pararm_1);
        obj.push_back(9);

        obj.pop_front();
        System.out.println(obj.max_value());

    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */

class MaxQueue {
    // 题目中，说时间 复杂度为O（1）
    // 意思就是说，将用空间换时间
    // 给与提示 ： sliding window ， stack
    /**
     * 这个是正常顺序的队列
     */

    private int index = 0;
    private List<Integer> deque = null;
    private List<Integer> queue = null;
    public MaxQueue() {
        deque = new ArrayList<>();
        queue = new ArrayList<>();
    }

    public int max_value() {
        if(!deque.isEmpty()) {
            return deque.get(0);
        }
        return -1;
    }

    public void push_back(int value) {
        while(!deque.isEmpty() && value >= deque.get(deque.size()-1)) {
            deque.remove(deque.size()-1);
        }
        deque.add(value);
        queue.add(value);
    }

    public int pop_front() {
        if(queue.isEmpty()) {
            return -1;
        }
        int pnum = queue.get(0);
        if(deque.get(0) == pnum) {
            deque.remove(0);
        }
        queue.remove(0);
        return pnum;
    }
}

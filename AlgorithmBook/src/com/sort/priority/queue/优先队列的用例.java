package com.sort.priority.queue;

import edu.princeton.cs.algs4.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: 优先队列的用例 .java
 * @Create : 2019-02-25-19:09
 * @Description :
 */
public class 优先队列的用例 {

    public static void main(String[] args) {

        int M = Integer.parseInt(args[0]);
        MinPQ<Transaction> pq = new MinPQ<>(M+1);
        while (StdIn.hasNextLine()){
            pq.insert(new Transaction(StdIn.readLine()));
            if (pq.size() > M){
                pq.delMin();
            }
            Stack<Transaction> stack = new Stack<>();
            while (!pq.isEmpty() ){
                stack.push(pq.delMin());
            }
            for (Transaction t : stack){
                StdOut.println(t);
            }
        }
    }
}

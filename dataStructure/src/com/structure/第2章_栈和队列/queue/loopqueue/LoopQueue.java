package com.structure.第2章_栈和队列.queue.loopqueue;

import com.structure.第2章_栈和队列.queue.Queue;

public class  LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;
                        // LoopQueue中不声明size，如何完成所有的逻辑？
                        // 这个问题可能会比大家想象的要难一点点：）

    public LoopQueue(int capacity){
        data = (E[])new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public boolean isEmpty(){
        return front == tail;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void enqueue(E e){

        if((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size ++;
    }

    @Override
    public E dequeue(){

        if(isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }

        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        if(size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront(){
        if(isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }
        return data[front];
    }

    private void resize(int newCapacity){

        E[] newData = (E[])new Object[newCapacity + 1];
        for(int i = 0 ; i < size ; i ++) {
            newData[i] = data[(i + front) % data.length];
        }

        data = newData;
        front = 0;
        tail = size;
    }
    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
        res.append("front [");
        for(int i = front ; i != tail ; i = (i + 1) % data.length){
            res.append(data[i]);
            if((i + 1) % data.length != tail) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
    public int[] distributeCandies(int candies, int num_people) {
        double answer = -0.5 + Math.sqrt(0.25 + 2 * candies); //二次方程求解
        int n = (int)Math.ceil(answer);
        int succn = (int)Math.floor(answer);
        int [] ret = new int[num_people];
        for(int i = 0;i < num_people;i++){
            double c = Math.floor(n / num_people);
            if(n % num_people - i > 0)c += 1;
            ret[i] =(int) (c * (i + 1) + (c * c - c) * num_people / 2); //等差求和公式

            if(n > succn && succn % num_people - i == 0){ //如果最后一次糖数不满
                int highanswer = (n * n + n) / 2; //如果不差数所拥有的值
                ret[i] -= highanswer - candies;
            }
        }
        return ret;
    }
    public static void main(String[] args){

        LoopQueue<Integer> queue = new LoopQueue<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);

            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}

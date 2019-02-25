package com.sort.priority.queue;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: MaxPQ .java
 * @Create : 2019-02-25-19:21
 * @Description :
 */
public class MaxPQ<key extends Comparable<key>> {

    private key[] pq;
    private int N = 0;

    public MaxPQ(int maxN){
        pq = (key[]) new Comparable[maxN +1];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void insert(key v){
        pq[++N] =v;
        swim(N);
    }
    public key delMax(){
        key max = pq[1];
        exch(1, N--);
        pq[N+1] = null;
        sink(1);
        return max;
    }
    private boolean less(int i,int j){
        return pq[i].compareTo(pq[j] ) < 0;
    }

    private void exch(int i,int j){
        key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    /**
     * 由下至上的堆有序化
     * @param k
     */
    private void swim(int k){
        while (k>1 && less(k/2,k)){
            exch(k/2,k);
        }
    }

    /**
     * 由上之下的堆有序化
     * @param k
     */
    private void sink(int k){
        while (2*k <= N){
            int j = 2*k;
            if (j < N && less(j,j+1)){
                j++;
            }
            if (!less(k,j)){
                break;
            }
            exch(k,j);
            k = j;
        }
    }
}

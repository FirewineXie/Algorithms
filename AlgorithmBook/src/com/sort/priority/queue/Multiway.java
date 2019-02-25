package com.sort.priority.queue;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.IndexMinPQ;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: Multiway .java
 * @Create : 2019-02-25-19:35
 * @Description :
 */
public class Multiway {

    public static void merge(In[] streams) {

        int N = streams.length;
        IndexMinPQ<String> pq = new IndexMinPQ<>(N);

        for (int i = 0; i < N; i++) {
            if (!streams[i].isEmpty()) {
                pq.insert(i, streams[i].readString());
            }
        }
        while (!pq.isEmpty()) {
            StdOut.println(pq.delMin());
            int i = pq.delMin();
            if (!streams[i].isEmpty()) {
                pq.insert(i, streams[i].readString());
            }
        }
    }

    public static void main(String[] args) {

        int N = args.length;
        In[] streams = new In[N];
        for (int i=0;i<N;i++){
            streams[i] = new In(args[i]);
        }
        merge(streams);
    }
}

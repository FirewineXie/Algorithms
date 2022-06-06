package com.study.Algorithm.middle;

import java.util.Arrays;

/**
 * @author Firewine Xie
 * @version 1.0.0
 * @ClassName 网络延迟时间_743
 * @createTime: 2021年08月02日 09:03:14
 * @Description TODO
 */
public class 网络延迟时间_743 {

    /* 使用Dijkstra  算法  ，
     *  从结点 k  到达接机点x 的时间，到达其余所有结点，的最长时间就是答案。
     *
     * */

    public int networkDelayTime(int[][] times, int n, int k) {
        final int INF = Integer.MAX_VALUE / 2;
        int[][] g = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(g[i], INF);
        }
        for (int[] t : times) {
            int x = t[0] - 1, y = t[1] - 1;
            g[x][y] = t[2];
        }
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[k - 1] = 0;
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int x = -1;
            for (int y = 0; y < n; ++y) {
                if (!used[y] && (x == -1 || dist[y] < dist[x])) {
                    x = y;
                }
            }
            used[x] = true;
            for (int y = 0; y < n; ++y) {
                dist[y] = Math.min(dist[y], dist[x] + g[x][y]);
            }
        }
        int ans = Arrays.stream(dist).max().getAsInt();
        return ans == INF ? -1 : ans;
    }


    public static void main(String[] args) {

    }
}

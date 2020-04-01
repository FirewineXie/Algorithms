package com.study.Algorithm.simple;


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 腐烂的橘子BFS
 * @Create : 2020/3/4
 * @Description : BFS 广度优先遍历
 */
public class 腐烂的橘子BFS {
        int[] dr = new int[]{-1, 0, 1, 0};
        int[] dc = new int[]{0, -1, 0, 1};

        public int orangesRotting(int[][] grid) {
            int R = grid.length, C = grid[0].length;

            // queue : all starting cells with rotten oranges
            Queue<Integer> queue = new ArrayDeque();
            Map<Integer, Integer> depth = new HashMap();
            for (int r = 0; r < R; ++r) {
                for (int c = 0; c < C; ++c) {
                    if (grid[r][c] == 2) {
                        int code = r * C + c;
                        queue.add(code);
                        depth.put(code, 0);
                    }
                }
            }

            int ans = 0;
            while (!queue.isEmpty()) {
                int code = queue.remove();
                int r = code / C, c = code % C;
                for (int k = 0; k < 4; ++k) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];
                    if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        int ncode = nr * C + nc;
                        queue.add(ncode);
                        depth.put(ncode, depth.get(code) + 1);
                        ans = depth.get(ncode);
                    }
                }
            }

            for (int[] row: grid) {
                for (int v: row) {
                    if (v == 1) {
                        return -1;
                    }
                }
            }
            return ans;

        }


    public static void main(String[] args) {
        腐烂的橘子BFS a = new 腐烂的橘子BFS();

        int[][] aa = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int[][] aa1 = new int[][]{{0}};
        System.out.println(aa1.length);
        System.out.println(a.orangesRotting(aa));
    }
}

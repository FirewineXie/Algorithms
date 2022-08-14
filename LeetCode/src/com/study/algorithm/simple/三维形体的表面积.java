package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 三维形体的表面积
 * @Create : 2020/3/25
 * @Description :
 */
public class 三维形体的表面积 {

    /**
     *  4 + 3 + 4 + 3 + 3 + 4 + 3 +
     * @param grid
     * @return
     */
    public int surfaceArea(int[][] grid) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};

        int N = grid.length;
        int ans = 0;

        for (int r = 0; r < N; ++r) {
            for (int c = 0; c < N; ++c) {
                if (grid[r][c] > 0) {
                    ans += 2;
                    for (int k = 0; k < 4; ++k) {
                        int nr = r + dr[k];
                        int nc = c + dc[k];
                        int nv = 0;
                        if (0 <= nr && nr < N && 0 <= nc && nc < N) {
                            nv = grid[nr][nc];
                        }

                        ans += Math.max(grid[r][c] - nv, 0);
                    }
                }
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        三维形体的表面积 a= new  三维形体的表面积();

        System.out.println(a.surfaceArea(new int[][]{{1,2},{3,4}}));

    }
}

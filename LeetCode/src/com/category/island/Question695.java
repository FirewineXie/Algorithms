package com.category.island;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question695
 * @createTime 2022年07月08日 08:34:26
 * @Description TODO
 */
public class Question695 {

    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 1) {

                    int temp = dfs(grid, i, j);
                    if (temp > maxArea) {
                        maxArea = temp;
                    }
                }

            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        int sum = 1;
        int nr = grid.length;
        int nc = grid[0].length;

        if (i < 0 || j < 0 || i >= nr || j >= nc || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        sum += dfs(grid, i + 1, j);
        sum += dfs(grid, i, j + 1);
        sum += dfs(grid, i - 1, j);
        sum += dfs(grid, i, j - 1);
        return sum;
    }
}

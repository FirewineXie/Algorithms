package com.category.island;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question200
 * @createTime 2022年07月07日 09:40:45
 * @Description TODO
 */
public class Question200 {


    // 深度优先遍历，每次找到一个小岛，while 标识小岛加1

    public int numIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    sum++;
                }

            }
        }
        return sum;
    }

    private void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);




    }


}

package com.study.Algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 车的可用捕获量
 * @Create : 2020/3/26
 * @Description :
 */
public class 车的可用捕获量 {
    public int numRookCaptures(char[][] board) {

        // 1. 找到 R
        // 四个方面遍历
        // 遇到B 停止
        // 遇到数组边缘 停止
        // 要记录R 的位置
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        int a = 0, b = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    int res = 0;
                    for (int[] direction : directions) {
                        if (burnout(board, i, j, direction)) {
                            res++;
                        }

                    }
                    return res;
                }
            }
        }
        return 0;

    }

    /**
     * burnout 横冲直撞的意思（来自欧路词典）
     *
     * @param board     输入棋盘
     * @param x         当前白象位置的横坐标
     * @param y         当前白象位置的纵坐标
     * @param direction 方向向量
     * @return 消灭一个 p，就返回 true
     */
    private boolean burnout(char[][] board, int x, int y, int[] direction) {
        int i = x;
        int j = y;
        while (inArea(i, j)) {
            // 是友军，路被堵死，直接返回
            if (board[i][j] == 'B') {
                break;
            }

            // 是敌军，拿下一血（不知道一血这个词是不是这么用的）
            if (board[i][j] == 'p') {
                return true;
            }

            i += direction[0];
            j += direction[1];
        }
        return false;
    }

    /**
     * @param i 当前位置横坐标
     * @param j 当前位置纵坐标
     * @return 是否在棋盘有效范围内
     */
    private boolean inArea(int i, int j) {
        return i >= 0 && i < 8 && j >= 0 && j < 8;
    }


    public static void main(String[] args) {
        车的可用捕获量 a = new 车的可用捕获量();

        char[][] bb = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'R', '.', '.', '.', 'p'}, {
                '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {
                '.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {
                '.', '.', '.', '.', '.', '.', '.', '.'}};

        System.out.println(a.numRookCaptures(bb));


    }
}

package PengH.leetcode;

import java.util.Arrays;

/*根据?百度百科?，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。

给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞都具有一个初始状态：1 即为活细胞（live），或 0 即为死细胞（dead）。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：

如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
根据当前状态，写一个函数来计算面板上所有细胞的下一个（一次更新后的）状态。下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。*/
public class Solution289 {

    public static void main(String[] args) {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        Solution289 solu = new Solution289();
        solu.gameOfLife2(board);
        for (int[] ints : board) {
            System.out.println(Arrays.toString(ints));
        }

    }

    public void gameOfLife(int[][] board) {

        int[][] copy = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                copy[i][j] = change(board, i, j);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = copy[i][j];
            }
        }

    }

    public int change(int[][] board, int i, int j) {
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {-1, 1}, {1, -1}, {1, 1}, {-1, -1}};
        int count = 0;
        for (int x = 0; x < direction.length; x++) {
            int newi = i + direction[x][0];
            int newj = j + direction[x][1];
            if (inArea(board, newi, newj) && board[newi][newj] == 1) {
                count++;
            }

        }
        if (count == 3)
            return 1;
        if (count == 2)
            return board[i][j] == 1 ? 1 : 0;
        else return 0;
    }

    public boolean inArea(int[][] board, int i, int j) {
        return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
    }
/*第二种方法，多标记两种状态*/
    public void gameOfLife2(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]=change2(board,i,j);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==2)
                board[i][j]=1;
                else if(board[i][j]==-1)
                    board[i][j]=0;
            }
        }

    }
    public int change2(int[][] board, int i, int j) {
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {-1, 1}, {1, -1}, {1, 1}, {-1, -1}};
        int count = 0;
        for (int x = 0; x < direction.length; x++) {
            int newi = i + direction[x][0];
            int newj = j + direction[x][1];
            if (inArea(board, newi, newj) && (board[newi][newj] == 1||board[newi][newj] == -1)) {
                count++;
            }

        }
        if (board[i][j]==1&&(count>3||count<2))
            return -1;
        if(board[i][j]==0&&count==3)
            return 2;
        else return board[i][j];
    }
}

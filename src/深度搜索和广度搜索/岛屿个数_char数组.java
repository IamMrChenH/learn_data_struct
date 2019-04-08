package 深度搜索和广度搜索;

import java.util.Arrays;

public class 岛屿个数_char数组 {

    static int[][] book = new int[1000][1000];
    private static int[][] next = {
            {0, 1}, //右
            {1, 0}, //下
            {0, -1},//左
            {-1, 0}//上
    };

    public static int numIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > '0') {
                    sum--;
                    dis(grid, i, j);
                }
            }
        }
        return -sum;
    }

    public static void dis(char[][] map, int x, int y) {
        int tx, ty;
        map[x][y] = '0' - 10;

        for (int i = 0; i < next.length; i++) {
            tx = next[i][0] + x;
            ty = next[i][1] + y;

            if (tx < 0 || tx >= map.length || ty < 0 || ty >= map[0].length)
                continue;

            if (map[tx][ty] > '0' && book[tx][ty] == 0) {
                book[tx][ty] = 1;
                dis(map, tx, ty);
                //book[tx][ty] = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        char[][] a = {
//                {'1', '0', '0', '0', '1'},
//                {'1', '0', '0', '0', '0'},
//                {'1', '0', '1', '0', '0'},
//                {'1', '1', '1', '0', '0'}
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}


        };

        System.out.println(岛屿个数_char数组.numIslands(a));

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

    }


}

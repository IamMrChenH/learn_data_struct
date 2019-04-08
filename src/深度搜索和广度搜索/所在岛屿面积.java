package 深度搜索和广度搜索;

import 实体类.GDNode;

public class 所在岛屿面积 {

    private static int[][] next = {
            {0, 1}, //右
            {1, 0}, //下
            {0, -1},//左
            {-1, 0}//上
    };


    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] map = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };

        int book[][] = new int[4][5];
        int head = 0, tail = 0;

        GDNode que[] = new GDNode[5 * 4];
        GDNode node = new GDNode(0, 0, 0);
        que[tail] = node;
        tail++;

        int tx, ty, pX = 0, pY = 0;
        int sum = 0, flag = 0;

        while (head < tail) {
            for (int i = 0; i < next.length; i++) {
                tx = que[head].x + next[i][0];
                ty = que[head].y + next[i][1];

                if (tx < 0 || tx > next[0].length || ty < 0 || ty > next.length)
                    continue;

                if (map[tx][ty] != 0 && book[tx][ty] == 0) {
                    sum++;
                    book[tx][ty] = 1;
                    que[tail] = new GDNode(tx, ty, que[head].s + 1);
                    tail++;
                }

            }


            head++;

        }

        System.out.println("小岛面积 ： " + sum);
    }

    public static int numIslands(char[][] grid) {


        return 0;

    }

}

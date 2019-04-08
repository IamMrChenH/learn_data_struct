package 深度搜索和广度搜索;

import 实体类.GDNode;

public class 广度_解救小哈_迷宫路径 {


    private static int pX = 3, qY = 2;
    static int[][] map;
    static int[][] book = new int[51][51];

    private static int[][] next = {
            {0, 1}, //右
            {1, 0}, //下
            {0, -1},//左
            {-1, 0}//上
    };

    public static void main(String[] args) {
        System.out.println("Hello World!");
        map = new int[5][4];
        深度_解救小哈_迷宫路径.initData(map);
        map[0][2] = 1;
        map[2][2] = 1;
        map[3][1] = 1;
        map[4][3] = 1;

        int head = 0, tail = 0;
        int tx, ty;
        GDNode que[] = new GDNode[5 * 4];

        GDNode node = new GDNode(0, 0, 0);
        que[tail] = node;
        tail++;

        book[0][0] = 1;

        int flag = 0;
        while (head < tail) {
            for (int i = 0; i < next.length; i++) {
                tx = next[i][0] + que[head].x;
                ty = next[i][1] + que[head].y;

                if (tx < 0 || tx > 4 || ty < 0 || ty > 3)
                    continue;

                if (map[tx][ty] == 0 && book[tx][ty] == 0) {
                    book[tx][ty] = 1;
                    que[tail] = new GDNode(tx, ty, que[head].s + 1);
                    tail++;
                }

                if (tx == pX && ty == qY) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1)
                break;

            head++;

        }

        System.out.println(que[tail-1].s);


    }


    /**
     * 广度搜索
     *
     * @param x
     * @param y
     * @param step
     */
    private static void BFS(int x, int y, int step) {


    }


}



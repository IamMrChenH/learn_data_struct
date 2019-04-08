package 深度搜索和广度搜索;

public class 深度_解救小哈_迷宫路径 {

    private static int pX = 4, qY = 0, min = 999;
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
        int x = 0, y = 0;
        initData(map);
        map[0][2] = 1;
        map[2][2] = 1;
        map[3][1] = 1;
        map[4][3] = 1;
        printMap(map);

        book[x][y] = 1;
        dis(x, y, 0);
        System.out.println(min);

    }


    /**
     * @param x    当前X
     * @param y    当前y
     * @param step 步伐
     */
    public static void dis(int x, int y, int step) {
        if (x == pX && y == qY) {
            if (step < min)
                min = step;
            System.out.println("到达目标--" + step);
            return;
        }

        int tx, ty;
        for (int i = 0; i < next.length; i++) {
            tx = next[i][0] + x;
            ty = next[i][1] + y;

            if (tx < 0 || tx > 4 || ty < 0 || ty > 3)
                continue;

            if (map[tx][ty] == 0 && book[tx][ty] == 0) {
                book[tx][ty] = 1;
                dis(tx, ty, step + 1);
                book[tx][ty] = 0;
            }

        }


        return;
    }


    public static void initData(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 0;
            }
        }
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }


}



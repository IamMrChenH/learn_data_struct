package 深度搜索和广度搜索;

public class 岛屿个数 {
    static int[][] map = {
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1},
    };
    static int[][] book = new int[51][51];

    private static int[][] next = {
            {0, 1}, //右
            {1, 0}, //下
            {0, -1},//左
            {-1, 0}//上
    };


    public static void dis(int x, int y, int color) {
        int tx, ty;
        map[x][y] = color;
        for (int i = 0; i < next.length; i++) {
            tx = next[i][0] + x;
            ty = next[i][1] + y;

            if (tx < 0 || tx >= map.length || ty < 0 || ty >= map[0].length)
                continue;


            if (map[tx][ty] > 0 && book[tx][ty] == 0) {
                book[tx][ty] = 1;
                dis(tx, ty, color);
                //book[tx][ty] = 0;
            }


        }


    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("tx.len == " + map.length);
        //System.out.println("ty.len == " + map[0].length);
        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] > 0) {
                    --sum;
                    dis(i, j, sum);
                    // System.out.println(map[i][j]);
                }

            }
        }

        System.out.println("小岛屿有 " + -sum + " 个");

        //深度_解救小哈_迷宫路径.printMap(map);


    }


}

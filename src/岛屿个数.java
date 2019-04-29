public class 岛屿个数 {
    static int book[][] = new int[100][100];
    static int action[][] = {
            {-1, 0},//上
            {1, 0},//下
            {0, -1},//左
            {0, 1}//右
    };

    public static int numIslands(char[][] grid) {
        //涛涛神技 无中生有
        int sum = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    isNum(grid, i, j);
                    sum = sum + 1;
                }
            }
        return sum;
    }


    private static void isNum(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        int nextI, nextJ;
        for (int k = 0; k < action.length; k++) {
            nextI = i + action[k][0];
            nextJ = j + action[k][1];
            if (nextI < 0 || nextI >= grid.length || nextJ < 0 || nextJ >= grid[0].length) continue;
            if (grid[nextI][nextJ] == '1' && book[nextI][nextJ] == 0) {
                book[nextI][nextJ] = 1;
                isNum(grid, nextI, nextJ);
            }
        }
    }

    public static void main(String[] args) {

        char a[][] = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(a));

    }

}

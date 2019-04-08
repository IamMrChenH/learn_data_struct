public class 数字全排列 {
    static int book[] = new int[100];
    static int a[] = new int[100];
    static int len = 2;

    public static void main(String[] args) {

        System.out.println("Hello World!");
        fun(1);

    }


    public static void fun(int start) {
        //边界 不知道
        if (start == len + 1) {
            for (int i = 1; i <= len; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
            return;
        }

        for (int i = 1; i <= len; i++) {
            if (book[i] == 0) {
                a[start] = i;
                book[i] = 1;
                fun(start + 1);
                book[i] = 0;
            }

        }

        return;

    }

}

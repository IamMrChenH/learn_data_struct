public class DemoMain {
    static int book[] = new int[100];
    static int a[] = new int[100];
    static int len = 9;
    static int sum= 0;
    public static void main(String[] args) {

        System.out.println("Hello World!");
        fun(1);
        System.out.println(sum/2);
    }


    public static void fun(int start) {
        //边界 不知道
        if (start == len+1 ) {
            int A = a[1] * 100 + a[2] * 10 + a[3];
            int B = a[4] * 100 + a[5] * 10 + a[6];
            int C = a[7] * 100 + a[8] * 10 + a[9];

            if((A+B) == C){
                sum++;
                System.out.println(A+"+"+B + " = " + C );
            }


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

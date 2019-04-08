import java.lang.reflect.Array;
import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] A) {
        int len = 100000;

        int[] p = new int[len];
        for (int i = 0; i < len; i++) {
            p[i] = (int) (Math.random() *len);

        }


        long time = System.currentTimeMillis();
        sort(p, 0, p.length - 1);
        long p1Time = System.currentTimeMillis() - time;



        int[] p2 = new int[len];
        for (int i = 0; i < len; i++) {
            p2[i] = (int) (Math.random() *len);

        }


        time = System.currentTimeMillis();
        Arrays.sort(p2);
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(p1Time);


       // System.out.println(Arrays.toString(p));

        //System.out.println(Arrays.toString(p2));

    }

    /**
     * 快速排序
     *
     * @param p
     * @param left
     * @param right
     */
    public static void sort(int[] p, int left, int right) {
        if (left >= right) return;

        int head = p[left];
        int i = left, j = right;

        while (i < j) {
            while (i < j && p[j] >= head) j--;
            while (i < j && p[i] <= head) i++;
            swap(p, i, j);
        }

        swap(p, left, i);

        sort(p, left, i - 1);
        sort(p, i + 1, right);


    }


    public static void swap(int[] p, int i, int j) {
        int t = p[i];
        p[i] = p[j];
        p[j] = t;

    }
}

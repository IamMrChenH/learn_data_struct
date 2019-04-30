public class 完全平方数 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int sqrt = (int) Math.sqrt(i);
            if ((i * i) == sqrt) {
                System.out.println(i);
            }
            System.out.println(sqrt);
        }


    }


}

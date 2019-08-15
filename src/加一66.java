import java.util.stream.Stream;

class 加一66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }

    public static void main(String[] args) {

        Stream.of(new 加一66().plusOne(new int[]{1, 2, 3})).forEach(System.out::println);
    }

}
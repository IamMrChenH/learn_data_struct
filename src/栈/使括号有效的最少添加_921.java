package 栈;

/**
 * @author CHENH
 * @version 1.0
 * @date 2020/02/01
 */
public class 使括号有效的最少添加_921 {

    public static int minAddToMakeValid(String S) {
        char[] array = S.toCharArray();
        char[] result = new char[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (index > 0 && result[index - 1] == '(' && array[i] == ')') {
                index--;
            } else {
                result[index++] = array[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("(())))"));
    }
}

package 栈;

/**
 * @author CHENH
 * @version 1.0
 * @date 2020/02/01
 */
public class 比较含退格的字符串_844 {

    public boolean backspaceCompare(String S, String T) {
        return backString(S).equals(backString(T));
    }

    public String backString(String S) {
        char[] arrayS = S.toCharArray();
        int index = 0;
        for (int i = 0; i < arrayS.length; i++) {
            if (arrayS[i] == '#') {
                if (index > 0)
                    index--;
            } else {
                arrayS[index++] = arrayS[i];
            }
        }
        return new String(arrayS, 0, index);
    }

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "b#y#f#o##f";
        System.out.println(new 比较含退格的字符串_844().backspaceCompare(s, t));

    }
}

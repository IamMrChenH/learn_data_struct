package 栈;

/**
 * @author CHENH
 * @version 1.0
 * @date 2020/01/30
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * <p>
 * 示例：
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 * <p>
 * 提示：
 * 1 <= S.length <= 20000
 * S 仅由小写英文字母组成。
 */
public class 删除字符串中的所有相邻重复项1047 {

    public static void main(String[] args) {
        删除字符串中的所有相邻重复项1047 a = new 删除字符串中的所有相邻重复项1047();
        System.out.println(a.removeDuplicates("aa"));

    }

    public String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++, index++) {
            chars[index] = chars[i];
            if (index > 0 && chars[index] == chars[index - 1]) {
                index -= 2;
            }
        }
        return new String(chars, 0, index);
    }

}

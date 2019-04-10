package 反射;

import java.lang.reflect.Field;

public class 递归反射获取字段值 {

    /**
     * 反射获取类中的字段 可以获取任意字段哦
     *
     * @param fileName
     * @param object
     * @param mcls
     * @return
     */
    public static String getClassFieldData(String fileName, Object object, Class<?> mcls) {
        try {
            if (mcls == null) return "空的";
            Field tryField = mcls.getDeclaredField(fileName);
            tryField.setAccessible(true);
            Object o = tryField.get(object);
            return (String) o;
        } catch (Exception e) {
            return getClassFieldData(fileName, object, mcls.getSuperclass());
        }
    }
}

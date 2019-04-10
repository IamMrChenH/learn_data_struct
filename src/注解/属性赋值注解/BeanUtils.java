package 注解.属性赋值注解;

import java.lang.reflect.Field;

public class BeanUtils {
    public static void init(Class<?> mTClass) {
        long time = System.currentTimeMillis();
        Field[] fields = mTClass.getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(BindData.class)) {
                BindData annotation = f.getAnnotation(BindData.class);
                try {
                    Bean bean = Bean.class.newInstance();
                    bean.id = annotation.id();
                    bean.name = annotation.name();
                    f.set(bean, bean);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}

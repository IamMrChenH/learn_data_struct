package 注解.占位;

import java.lang.reflect.Field;

public class BeanMain {
    @BindData(id = 100, name = "taotao")
    public static Bean mBean;

    @BindData(id = 9999, name = "gayBing")
    public static Bean mBean2;

    public static void main(String[] a) {

        long time = System.currentTimeMillis();
        Field[] fields = BeanMain.class.getDeclaredFields();
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

        System.out.println(mBean.name);
    }
}

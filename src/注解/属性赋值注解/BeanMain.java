package 注解.属性赋值注解;

public class BeanMain {
    @BindData(id = 100, name = "taotao")
    public static Bean mBean;

    @BindData(id = 9999, name = "gayBing")
    public static Bean mBean2;

    public static void main(String[] a) {
        BeanUtils.init(BeanMain.class);

        System.out.println(mBean.toString());
        System.out.println(mBean2.toString());
    }
}

package 注解.一个简单注解;

@TestAnnotation(id = 100, msg = "456")
public class Main {

    public static void main(String[] a) {
        boolean annotation = Main.class.isAnnotationPresent(TestAnnotation.class);

        if (annotation) {
            TestAnnotation node = Main.class.getAnnotation(TestAnnotation.class);
            System.out.println(node.id());
            System.out.println(node.msg());

        }

    }
}

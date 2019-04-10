//package 安卓.注解反射获取View;
//public class BindViewUtils {
//    public static void init(Activity activity) {
//        long time = System.nanoTime();
//        for (Field f : activity.getClass().getDeclaredFields()) {
//            if (f.isAnnotationPresent(BindView.class)) {
//                BindView node = f.getAnnotation(BindView.class);
//                try {
//                    f.set(activity, activity.findViewById(node.value()));
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        Log.e("Time", (System.nanoTime() - time) + "ns");
//
//    }
//}

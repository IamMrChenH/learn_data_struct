/**
 * @Author: CHENH
 * @Date: 2019/5/22 16:02
 * @Version 1.0
 */
public class String和StringBuff时间效率 {

    public static void main(String[] a) {
        String data = "";
        long N = 10000000*4;

        long time = System.currentTimeMillis();
//        for (int i = 0; i < N; i++) {
//            data += "id_" + i + "  ";
//        }
//
        long curTime = System.currentTimeMillis() - time;
//        System.out.println("String +  data:" + "时间:" + curTime);


//        data = "";
//        time = System.currentTimeMillis();
//        for (int i = 0; i < N; i++) {
//            data += new String("id_" + i + "  ");
//        }
//
//        curTime = System.currentTimeMillis() - time;
//        System.out.println("new String data " + "时间:" + curTime);


        time = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();

        for (long i = 0; i < N; i++) {
            stringBuffer.append("id_" + i + "  ");
        }
        curTime = System.currentTimeMillis() - time;
        System.out.println("new StringBuffer data " + "时间:" + curTime);



        time = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (long i = 0; i < N; i++) {
            stringBuilder.append("id_" + i + "  ");
        }
        curTime = System.currentTimeMillis() - time;
        System.out.println("new StringBuilder data " + "时间:" + curTime);


    }
}

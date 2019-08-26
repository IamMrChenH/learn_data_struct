package 设计模式.观察者模式;

import 设计模式.观察者模式.demo.MyHumidity;
import 设计模式.观察者模式.demo.MyTemp;
import 设计模式.观察者模式.demo.WeatherData;

/**
 * @author chenh
 * @date 2019-08-26
 */
public class TestMain {
    public static void main(String[] args) {
        //被观察者
        WeatherData data = new WeatherData();
        //观察者1 温度
        MyTemp temp = new MyTemp();
        //观察者2 湿度
        MyHumidity humidity = new MyHumidity();
        //注册
        data.registerObServer(temp);
        data.registerObServer(humidity);

        //更新数据
        data.setData();

    }
}

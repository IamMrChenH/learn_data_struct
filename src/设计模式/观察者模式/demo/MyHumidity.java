package 设计模式.观察者模式.demo;

import 设计模式.观察者模式.interfaces.DisplayElement;
import 设计模式.观察者模式.interfaces.Observer;
import 设计模式.观察者模式.interfaces.Subject;

/**
 * @author chenh
 * @date 2019-08-26
 */
public class MyHumidity implements Observer, DisplayElement {

    private double humidity;

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData data = (WeatherData) subject;
            this.humidity = data.getHumidity();

        }

        display();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{" +
                "当前湿度是: " + humidity +
                '}';
    }
}

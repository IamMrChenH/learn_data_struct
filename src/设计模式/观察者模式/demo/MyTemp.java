package 设计模式.观察者模式.demo;

import 设计模式.观察者模式.interfaces.DisplayElement;
import 设计模式.观察者模式.interfaces.Observer;
import 设计模式.观察者模式.interfaces.Subject;

/**
 * @author chenh
 * @date 2019-08-26
 */
public class MyTemp implements Observer, DisplayElement {

    /**
     * 温度
     */
    private double temp;

    @Override
    public void update(Subject subject) {

        if (subject instanceof WeatherData) {
            WeatherData data = (WeatherData) subject;
            this.setTemp(data.getTemperature());
        }
        display();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "{" +
                "当前温度是: =" + temp +
                '}';
    }
}

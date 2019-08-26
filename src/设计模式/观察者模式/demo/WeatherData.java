package 设计模式.观察者模式.demo;

import 设计模式.观察者模式.interfaces.Observer;
import 设计模式.观察者模式.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据
 *
 * @author chenh
 * @date 2019-08-23
 */
public class WeatherData implements Subject {

    /**
     * 温度
     */
    private double temperature;

    /**
     * 湿度
     */
    private double humidity;

    /**
     * 压力
     */
    private double pressure;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObServer(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.isEmpty()) {
            return;
        }
        int indexOf = observers.indexOf(observers);
        observers.remove(indexOf);
    }

    @Override
    public void notifyObservers() {
        if (observers.isEmpty()) {
            return;
        }
        observers.forEach(observer -> observer.update(this));
    }


    public void setData() {
        setHumidity(Math.random() * 100);
        setPressure(Math.random() * 100);
        setTemperature(Math.random() * 100);
        notifyObservers();
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}

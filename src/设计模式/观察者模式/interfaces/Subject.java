package 设计模式.观察者模式.interfaces;

/**
 * @author chenh
 * @date 2019-08-23
 */
public interface Subject {

    /**
     * 注册
     */
    void registerObServer(Observer observer);


    /**
     * 注销
     */
    void removeObserver(Observer o);

    /**
     * 刷新
     */
    void notifyObservers();
}

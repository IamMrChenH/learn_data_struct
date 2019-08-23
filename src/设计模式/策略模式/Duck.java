package 设计模式.策略模式;

import 设计模式.策略模式.interfaces.QuackBehavior;

/**
 * @author chenh
 * @date 2019-08-22
 */
public class Duck {

    /**
     * 鸭子叫
     */
    public QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 鸭子叫 动作
     */
    public void performQuack() {
        quackBehavior.quack();
    }
}

package 设计模式.策略模式;

import 设计模式.策略模式.interfaces.impl.RedQuack;

/**
 * @author chenh
 * @date 2019-08-23
 */
public class TestDuck {

    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.setQuackBehavior(new RedQuack());
        redDuck.performQuack();
    }

}

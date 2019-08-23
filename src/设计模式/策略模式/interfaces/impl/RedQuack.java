package 设计模式.策略模式.interfaces.impl;

import 设计模式.策略模式.interfaces.QuackBehavior;

/**
 * @author chenh
 * @date 2019-08-22
 */
public class RedQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱呱！");
    }
}

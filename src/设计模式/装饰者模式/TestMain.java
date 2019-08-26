package 设计模式.装饰者模式;

import 设计模式.装饰者模式.abstracts.Beverage;
import 设计模式.装饰者模式.demo.Espresso;
import 设计模式.装饰者模式.demo.Milk;
import 设计模式.装饰者模式.demo.Mocha;

/**
 * @author chenh
 * @date 2019-08-26
 */
public class TestMain {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        //双倍摩卡
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        //牛奶
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());

    }
}

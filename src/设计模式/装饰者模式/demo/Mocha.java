package 设计模式.装饰者模式.demo;

import 设计模式.装饰者模式.abstracts.Beverage;
import 设计模式.装饰者模式.abstracts.CondimentDecorator;

/**
 * 摩卡 装饰 配料
 *
 * @author chenh
 * @date 2019-08-26
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "摩卡";
    }

    @Override
    public double cost() {
        return 0.89 + beverage.cost();
    }

}

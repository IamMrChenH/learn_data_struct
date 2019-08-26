package 设计模式.装饰者模式.demo;

import 设计模式.装饰者模式.abstracts.Beverage;
import 设计模式.装饰者模式.abstracts.CondimentDecorator;

/**
 * 牛奶 配料
 *
 * @author chenh
 * @date 2019-08-26
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "牛奶";
    }

    @Override
    public double cost() {
        return 0.59 + beverage.cost();
    }
}

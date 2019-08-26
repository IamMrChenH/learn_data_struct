package 设计模式.装饰者模式.demo;

import 设计模式.装饰者模式.abstracts.Beverage;

/**
 * 浓缩咖啡
 *
 * @author chenh
 * @date 2019-08-26
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.setDescription("浓缩咖啡");
    }

    @Override
    public double cost() {
        return 20;
    }
}

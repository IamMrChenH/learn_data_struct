package 设计模式.装饰者模式.demo;

import 设计模式.装饰者模式.abstracts.Beverage;

/**
 * 混合咖啡
 *
 * @author chenh
 * @date 2019-08-26
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("混合咖啡");
    }

    @Override
    public double cost() {
        return 30;
    }
}

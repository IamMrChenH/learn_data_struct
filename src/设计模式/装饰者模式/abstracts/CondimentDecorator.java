package 设计模式.装饰者模式.abstracts;

/**
 * 调味品
 *
 * @author chenh
 * @date 2019-08-26
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}

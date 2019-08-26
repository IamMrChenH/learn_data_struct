package 设计模式.装饰者模式.abstracts;

/**
 * 价格父类
 *
 * @author chenh
 * @date 2019-08-26
 */
public abstract class Beverage {
    String description = "错误代码";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

}

package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 12:50
 * @description:装饰者抽象类
 */

public abstract class CarDecorator implements Car {
    @Override
    public abstract double Cost() ;

    @Override
    public abstract String Description() ;
}

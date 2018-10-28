package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 12:40
 * @description:凯美瑞汽车
 */

public class Camry implements Car {
    @Override
    public double Cost() {
        return 200000;
    }

    @Override
    public String Description() {
        return "丰田凯美瑞";
    }
}

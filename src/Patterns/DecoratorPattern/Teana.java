package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 12:46
 * @description:日产天籁
 */

public class Teana implements Car {
    @Override
    public double Cost() {
        return 180000;
    }

    @Override
    public String Description() {
        return "日产天籁";
    }
}

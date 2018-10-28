package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 12:42
 * @description:本田雅阁
 */

public class Accord implements Car {
    @Override
    public double Cost() {
        return 190000;
    }

    @Override
    public String Description() {
        return "本田雅阁";
    }
}

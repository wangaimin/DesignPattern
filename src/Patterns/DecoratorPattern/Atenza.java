package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 12:44
 * @description:马自达阿特兹
 */

public class Atenza implements Car {
    @Override
    public double Cost() {
        return 190000;
    }

    @Override
    public String Description() {
        return "马自达阿特兹";
    }
}

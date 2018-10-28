package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 13:01
 * @description:运动套件
 */

public class SportKit extends CarDecorator {

    Car car;
    @Override
    public double Cost() {
        return 5000+car.Cost();
    }

    public SportKit(Car car) {
    this.car=car;
    }

    @Override
    public String Description() {
        return car.Description()+"、运动套件";
    }
}

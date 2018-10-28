package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 12:55
 * @description:天窗
 */

public class SkyLight extends CarDecorator {

    Car car;
    @Override
    public double Cost() {
        return 3000+car.Cost();
    }

    public SkyLight(Car car) {
        this.car=car;
    }

    @Override
    public String Description() {
        return car.Description()+"、天窗";
    }
}

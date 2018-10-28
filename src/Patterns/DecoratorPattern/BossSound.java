package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 12:59
 * @description:BOSS音响
 */

public class BossSound extends CarDecorator {
   Car car;
    public BossSound(Car car) {
    this.car=car;
    }

    @Override
    public double Cost() {
        return 8000+car.Cost();
    }

    @Override
    public String Description() {
        return car.Description()+"、Boss音响";
    }
}

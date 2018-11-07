package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/7 12:09
 * description:食材抽象工厂
 */
public abstract class FoodMaterialFactory {

    /**
     * 获取猪品种
     * @return
     */
    public abstract String CreatePigCategory();
    /**
     * 获取青椒品种
     * @return
     */
    public abstract String CreateGreenPepperCategory();
    /**
     * 获取蒜苗品种
     * @return
     */
    public abstract String CreateGarlicBolt();

}

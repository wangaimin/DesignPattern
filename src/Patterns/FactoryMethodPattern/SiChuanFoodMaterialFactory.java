package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/7 12:12
 * description:四川工厂
 */
public class SiChuanFoodMaterialFactory extends FoodMaterialFactory {
    /**
     * 获取猪品种
     *
     * @return
     */
    @Override
    public String CreatePigCategory() {
        return "大肥猪";
    }

    /**
     * 获取青椒品种
     *
     * @return
     */
    @Override
    public String CreateGreenPepperCategory() {
        return "农家大青椒";
    }

    /**
     * 获取蒜苗品种
     *
     * @return
     */
    @Override
    public String CreateGarlicBolt() {
        return "温江特色蒜苗";
    }
}

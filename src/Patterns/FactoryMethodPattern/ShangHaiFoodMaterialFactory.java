package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/7 12:14
 * description:上海工厂
 */
public class ShangHaiFoodMaterialFactory extends  FoodMaterialFactory {
    /**
     * 获取猪品种
     *
     * @return
     */
    @Override
    public String CreatePigCategory() {
        return "工厂化大肥猪";
    }

    /**
     * 获取青椒品种
     *
     * @return
     */
    @Override
    public String CreateGreenPepperCategory() {
        return "蔬菜基地青椒";
    }

    /**
     * 获取蒜苗品种
     *
     * @return
     */
    @Override
    public String CreateGarlicBolt() {
        return "蔬菜基地蒜苗";
    }
}

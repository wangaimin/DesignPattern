package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 12:02
 * description:上海回锅肉
 */
public class ShangHaiRestaurant extends Restaurant
{
    FoodMaterialFactory foodMaterialFactory;
    public ShangHaiRestaurant(FoodMaterialFactory foodMaterialFactory) {
        this.foodMaterialFactory=foodMaterialFactory;
    }

    /**
     * 获取回锅肉类型
     *
     * @param type
     * @return
     */
    @Override
    protected DoubleDookedPorkSlices createDoubleDookedPorkSlices(String type) {
        if (type=="GreenPepper"){
            return new ShangHaiGreenPepperDoubleDookedPorkSlices(foodMaterialFactory);
        }else if(type=="GarlicBolt") {
            return new ShangHaiGarlicBoltDoubleDookedPorkSlices(foodMaterialFactory);
        }else{
            return null;
        }
    }
}

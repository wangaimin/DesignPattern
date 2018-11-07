package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:47
 * description:四川餐馆
 */
public class SiChuanRestaurant extends Restaurant {
    FoodMaterialFactory foodMaterialFactory;
    public SiChuanRestaurant( FoodMaterialFactory foodMaterialFactory) {
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
            return new SiChuanGreenPepperDoubleDookedPorkSlices(foodMaterialFactory);
        }else if(type=="GarlicBolt") {
            return new SiChuanGarlicBoltDoubleDookedPorkSlices(foodMaterialFactory);
        }else{
            return null;
        }
    }
}

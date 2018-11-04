package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:47
 * description:四川餐馆
 */
public class SiChuanRestaurant extends Restaurant {
    /**
     * 获取回锅肉类型
     *
     * @param type
     * @return
     */
    @Override
    protected DoubleDookedPorkSlices createDoubleDookedPorkSlices(String type) {
        if (type=="GreenPepper"){
            return new SiChuanGreenPepperDoubleDookedPorkSlices();
        }else if(type=="GarlicBolt") {
            return new SiChuanGarlicBoltDoubleDookedPorkSlices();
        }else{
            return null;
        }
    }
}

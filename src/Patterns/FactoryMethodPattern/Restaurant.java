package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:13
 * description:餐馆
 */
public abstract class Restaurant {


    /**
     * 获取回锅肉
     * @return
     */
    public DoubleDookedPorkSlices GetDoubleDookedPorkSlices(String type){

        DoubleDookedPorkSlices doubleDookedPorkSlices;
        doubleDookedPorkSlices=createDoubleDookedPorkSlices(type);

        doubleDookedPorkSlices.Prepare();
        doubleDookedPorkSlices.Boil();
        doubleDookedPorkSlices.Cut();
        doubleDookedPorkSlices.Fry();
        return doubleDookedPorkSlices;
    }

    /**
     * 获取回锅肉类型
     * @param type
     * @return
     */
    protected abstract DoubleDookedPorkSlices createDoubleDookedPorkSlices(String type);
}

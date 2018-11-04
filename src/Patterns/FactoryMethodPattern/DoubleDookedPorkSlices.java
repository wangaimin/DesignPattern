package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:12
 * description:回锅肉
 */
public abstract class DoubleDookedPorkSlices {

    /**
     * 准备
     */
    public abstract void  Prepare();

    /**
     * 煮
     */
    public abstract void Boil();


    /**
     * 切
     */
    public abstract void Cut();

    /**
     * 炒
     */
    public abstract void Fry();

    /**
     * 名称
     */
    public abstract String GetName();

}

package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:12
 * description:回锅肉
 */
public abstract class DoubleDookedPorkSlices {

    /**
     * 猪品种
     */
    protected String PigCategory;

    /**
     * 青椒品种
     */
    protected String GreenPepperCategory;

    /**
     * 蒜苗品种
     */
    protected String GarlicBolt;

    public String getPigCategory() {
        return PigCategory;
    }



    public void setPigCategory(String pigCategory) {
        PigCategory = pigCategory;
    }

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


    public String getGreenPepperCategory() {
        return GreenPepperCategory;
    }

    public void setGreenPepperCategory(String greenPepperCategory) {
        GreenPepperCategory = greenPepperCategory;
    }

    public String getGarlicBolt() {
        return GarlicBolt;
    }

    public void setGarlicBolt(String garlicBolt) {
        GarlicBolt = garlicBolt;
    }
}

package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 12:05
 * description:
 */
public class ShangHaiGreenPepperDoubleDookedPorkSlices extends DoubleDookedPorkSlices {
    FoodMaterialFactory foodMaterialFactory;

    public ShangHaiGreenPepperDoubleDookedPorkSlices(FoodMaterialFactory foodMaterialFactory) {
        this.foodMaterialFactory = foodMaterialFactory;
    }

    /**
     * 准备
     */
    @Override
    public void Prepare() {
        System.out.println(GetName());
        System.out.println("调用食材抽象工厂取出食材：");
        System.out.println(foodMaterialFactory.CreatePigCategory());
        System.out.println(foodMaterialFactory.CreateGarlicBolt());
       // System.out.println("准备好青椒和5分瘦5分精的猪肉、白糖");
    }

    /**
     * 煮
     */
    @Override
    public void Boil() {
        System.out.println("煮到9层熟");
    }

    /**
     * 名称
     */
    @Override
    public String GetName() {
        return "上海青椒回锅";
    }

    /**
     * 切
     */
    @Override
    public void Cut() {
        System.out.println("切薄");
    }

    /**
     * 炒
     */
    @Override
    public void Fry() {
        System.out.println("炒7分钟");
    }
}

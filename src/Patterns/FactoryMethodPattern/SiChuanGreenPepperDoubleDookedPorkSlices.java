package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:30
 * description:青椒回锅
 */
public class SiChuanGreenPepperDoubleDookedPorkSlices extends DoubleDookedPorkSlices {
    FoodMaterialFactory foodMaterialFactory;
    public SiChuanGreenPepperDoubleDookedPorkSlices(FoodMaterialFactory foodMaterialFactory) {
        this.foodMaterialFactory=foodMaterialFactory;
    }
    /**
     * 准备
     */
    @Override
    public void Prepare() {
        System.out.println(GetName());
        System.out.println("调用食材抽象工厂取出食材：");
        System.out.println(foodMaterialFactory.CreatePigCategory());
        System.out.println(foodMaterialFactory.CreateGreenPepperCategory());
       // System.out.println("准备好青椒和5分瘦5分精的猪肉、郫县豆瓣");
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
       return "四川青椒回锅";
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

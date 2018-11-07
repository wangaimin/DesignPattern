package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:37
 * description:蒜苗回锅
 */
public class SiChuanGarlicBoltDoubleDookedPorkSlices extends DoubleDookedPorkSlices {
    FoodMaterialFactory foodMaterialFactory;
    public SiChuanGarlicBoltDoubleDookedPorkSlices(FoodMaterialFactory foodMaterialFactory) {
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
        System.out.println(foodMaterialFactory.CreateGarlicBolt());
      //  System.out.println("准备好青椒和7分瘦3分精的猪肉");
    }

    /**
     * 煮
     */
    @Override
    public void Boil() {
        System.out.println("煮到8层熟");
    }

    /**
     * 名称
     */
    @Override
    public String GetName() {
        return "四川蒜苗回锅";
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
        System.out.println("炒6分钟");
    }
}

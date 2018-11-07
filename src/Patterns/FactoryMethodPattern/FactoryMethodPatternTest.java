package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:58
 * description:
 */
public class FactoryMethodPatternTest {
    public static void TestFactoryMethodPattern(){
        SiChuanRestaurant siChuanRestaurant=new SiChuanRestaurant(new SiChuanFoodMaterialFactory());
        siChuanRestaurant.GetDoubleDookedPorkSlices("GreenPepper");

        Restaurant shangHaiRestaurant=new ShangHaiRestaurant(new ShangHaiFoodMaterialFactory());
        shangHaiRestaurant.GetDoubleDookedPorkSlices("GarlicBolt");
    }
}

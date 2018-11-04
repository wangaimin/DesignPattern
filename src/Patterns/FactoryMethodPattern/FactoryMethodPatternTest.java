package Patterns.FactoryMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/4 11:58
 * description:
 */
public class FactoryMethodPatternTest {
    public static void TestFactoryMethodPattern(){
        SiChuanRestaurant siChuanRestaurant=new SiChuanRestaurant();
        siChuanRestaurant.GetDoubleDookedPorkSlices("GreenPepper");

        Restaurant shangHaiRestaurant=new ShangHaiRestaurant();
        shangHaiRestaurant.GetDoubleDookedPorkSlices("GarlicBolt");
    }
}

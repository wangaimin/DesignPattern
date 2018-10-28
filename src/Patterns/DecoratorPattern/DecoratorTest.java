package Patterns.DecoratorPattern;

/**
 * @author:wangaimin
 * @date:2018/10/28 13:02
 * @description:
 */

public class DecoratorTest {

    public static void Test(){
        Camry camry=new Camry();
        BossSound bossSound=new BossSound(camry);
        SportKit sportKit=new SportKit(bossSound);
        System.out.println(sportKit.Description());
        System.out.println("价格"+sportKit.Cost()+"元");
    }
}

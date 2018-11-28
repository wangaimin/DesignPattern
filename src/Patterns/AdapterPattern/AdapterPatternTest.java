package Patterns.AdapterPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/23 11:31
 * description:
 */
public class AdapterPatternTest {
    public static void TestAdapterPattern(){
        PowerAdapter powerAdapter=new PowerAdapter(new TwoHole());
        powerAdapter.Request();

        System.out.println();
    }
}

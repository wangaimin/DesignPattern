package Patterns.FacadePattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/28 11:37
 * description:
 */
public class FacadePatternTest {
    public static void Test(){

        HomeFacade homeFacade=new HomeFacade(new Light(),new Sound(),new TV());
        homeFacade.WatchMovie();
        homeFacade.EndMovie();

        System.out.println();
    }
}

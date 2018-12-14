package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 9:48
 * description:红头鸭
 */
public class RedHeadDuck implements Kuackable{
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎...");
    }
}

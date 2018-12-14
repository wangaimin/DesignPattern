package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/13 11:03
 * description:绿头鸭
 */
public class MallardDuck implements Kuackable {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎...");
    }
}

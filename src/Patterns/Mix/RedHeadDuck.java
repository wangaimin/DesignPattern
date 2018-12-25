package Patterns.Mix;

import java.util.Observable;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 9:48
 * description:红头鸭
 */
public class RedHeadDuck extends Observable implements Quackable {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎...");
    }
}

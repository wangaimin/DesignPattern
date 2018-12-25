package Patterns.Mix;

import java.util.Observable;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/13 11:03
 * description:绿头鸭
 */
public class MallardDuck extends Observable implements Quackable {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎...");
    }
}

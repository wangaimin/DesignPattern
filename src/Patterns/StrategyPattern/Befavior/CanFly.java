package Patterns.StrategyPattern.Befavior;

import Patterns.StrategyPattern.FlyBefavior;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/22 10:28
 * description:飞行为
 */
public class CanFly implements FlyBefavior {
    @Override
    public void Fly() {
        System.out.println("我能飞");
    }
}

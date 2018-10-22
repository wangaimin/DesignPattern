package Patterns.StrategyPattern.Befavior;

import Patterns.StrategyPattern.FlyBefavior;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/22 10:29
 * description:不能飞行为
 */
public class CanNotFly implements FlyBefavior {
    @Override
    public void Fly() {
        System.out.println("我飞不了");
    }
}

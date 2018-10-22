package Patterns.StrategyPattern;

import Patterns.StrategyPattern.Befavior.CanNotFly;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/22 10:15
 * description:玩具鸭
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBefavior = new CanNotFly();
    }

    @Override
    public void DisPlay() {
        System.out.println("我是一只玩具鸭，我五颜六色");
    }

    @Override
    public void MackSound() {
        System.out.println("格子格子格子");
    }
}

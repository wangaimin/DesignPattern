package Patterns.StrategyPattern;

import Patterns.StrategyPattern.Befavior.CanFly;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/22 10:09
 * description:绿头鸭
 */
public class MallardDuck extends Duck {

    public  MallardDuck(){
        flyBefavior=new CanFly();
    }

    @Override
    public void DisPlay() {
        System.out.println("我是一只绿头鸭，头是绿色的");
    }


}

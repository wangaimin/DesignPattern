package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/13 11:03
 * description:绿头鸭
 */
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("嘎嘎嘎...");
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}

package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 9:48
 * description:红头鸭
 */
public class RedHeadDuck implements Quackable {

    Observable observable;


    public RedHeadDuck() {
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("嘎嘎嘎...");
        notifyObserver();
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

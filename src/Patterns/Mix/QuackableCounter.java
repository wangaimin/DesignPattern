package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 10:09
 * description:
 */
public class QuackableCounter implements Quackable {
    Quackable quackable;
    static int count = 0;
    Observable observable;

    public QuackableCounter(Quackable quackable) {
        this.quackable = quackable;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        count++;
        quackable.quack();
        notifyObserver();
    }

    /**
     * 获取叫唤次数
     *
     * @return
     */
    public static int GetQuackCount() {
        return count;
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

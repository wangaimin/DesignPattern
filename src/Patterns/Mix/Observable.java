package Patterns.Mix;

import java.util.ArrayList;

/**
 * author:'Gene.A.Wang'
 * date:2019/1/17 10:43
 * description:定义一个统一的发布者，发布者都使用这里的方法，避免每个发布者都去实现自己的方法
 */
public class Observable implements QuackObservable {

   private Quackable duck;
   private ArrayList<QuackObserver> quackObservers = new ArrayList<>();

    public Observable(Quackable quackable) {
        this.duck = quackable;
    }


    @Override
    public void registerObserver(QuackObserver observer) {
        quackObservers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (QuackObserver observer : quackObservers) {
            observer.update(duck);
        }
    }
}

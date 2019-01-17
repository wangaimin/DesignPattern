package Patterns.Mix;

import java.util.ArrayList;
import java.util.Observer;

/**
 * @author:wangaimin
 * @date:2018/12/25 21:58
 * @description:群
 */

public class Flock implements Quackable {
    ArrayList<Quackable> arrayList = new ArrayList<>();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void Add(Quackable quackable) {
        this.arrayList.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable quackable : arrayList) {
            quackable.quack();
            observable.notifyObserver();
        }
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

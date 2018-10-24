
import Patterns.ObserverPattern.Phone;
import Patterns.ObserverPattern.TV;
import Patterns.ObserverPattern.Weather;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //策略模式
        //StrategyPatternTest.Test();

        //观察者模式
        Weather weather = new Weather();
        weather.setAirClassification("12级");
        weather.setTemperature("27°");
        weather.addObserver(new Phone());
        weather.addObserver(new TV());

        weather.setChangedTrue();
        weather.notifyObservers();
    }

}



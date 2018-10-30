package Patterns.ObserverPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/25 9:37
 * description:
 */
public class ObserverTest {


    public static  void Test(){
        Weather weather = new Weather();
        weather.setAirClassification("12级");
        weather.setTemperature("27°");
        weather.addObserver(new Phone());
        weather.addObserver(new TV());

        weather.setChangedTrue();
        weather.notifyObservers();
    }
}

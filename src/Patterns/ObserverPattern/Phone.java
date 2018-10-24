package Patterns.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/24 17:54
 * description:手机订阅天气
 */
public class Phone implements Observer {

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        Weather weather = (Weather) o;
        System.out.println(String.format("手机端---  温度：%s   风力：%s", weather.getTemperature(), weather.getAirClassification()));
        //System.out.format("手机端---  温度：%s   风力：%s", weather.getTemperature(), weather.getAirClassification());
       // System.out.printf("手机端---  温度：%s   风力：%s", weather.getTemperature(), weather.getAirClassification());
    }
}

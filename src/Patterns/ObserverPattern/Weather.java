package Patterns.ObserverPattern;

import java.util.Observable;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/24 17:46
 * description:天气主题
 */
public class Weather extends Observable {
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getAirClassification() {
        return airClassification;
    }

    public void setAirClassification(String airClassification) {
        this.airClassification = airClassification;
    }


    public void setChangedTrue(){
       setChanged();
    }


    /**
     * 温度
     */
    private String temperature;

    /**
     * 风力分级
     */
    private String airClassification;
}

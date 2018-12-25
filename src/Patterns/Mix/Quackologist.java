package Patterns.Mix;

import java.util.Observable;
import java.util.Observer;

/**
 * @author:wangaimin
 * @date:2018/12/25 22:36
 * @description:订阅者
 */

public class Quackologist implements Observer {
    @Override
    public void update(Observable o, Object arg) {
      //Quackable quackable=(Quackable)o;
      System.out.println("订阅了：");
    }
}

package Patterns.Mix;


/**
 * @author:wangaimin
 * @date:2018/12/25 22:18
 * @description:被观察者
 */
public interface QuackObservable {
    /*
    注册
     */
    public void registerObserver(QuackObserver observer);
    /*
    通知
     */
    public void notifyObserver();
}

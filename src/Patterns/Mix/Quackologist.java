package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2019/1/17 11:14
 * description:订阅者
 */
public class Quackologist implements QuackObserver {
    @Override
    public void update(Quackable duck) {
        System.out.println("开始呱呱叫了："+duck);
    }
}

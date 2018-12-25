package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 10:09
 * description:
 */
public class QuackableCounter implements Quackable {
    Quackable quackable;
    static int count=0;

    public QuackableCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        count++;
        quackable.quack();
    }

    /**
     * 获取叫唤次数
     * @return
     */
    public static int GetQuackCount(){
        return count;
    }
}

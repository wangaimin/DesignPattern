package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 10:09
 * description:
 */
public class KuackableCounter implements Kuackable {
    Kuackable kuackable;
    static int count=0;

    public KuackableCounter(Kuackable kuackable) {
        this.kuackable = kuackable;
    }

    @Override
    public void quack() {
        count++;
        kuackable.quack();
    }

    /**
     * 获取叫唤次数
     * @return
     */
    public static int GetQuackCount(){
        return count;
    }
}

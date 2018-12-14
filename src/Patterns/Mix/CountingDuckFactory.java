package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 14:55
 * description:带装饰者的鸭子
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    /**
     * 创建绿头鸭
     *
     * @return
     */
    @Override
    public Kuackable CreateMallardDuck() {
        return new KuackableCounter(new MallardDuck());
    }

    /**
     * 创建红头鸭
     *
     * @return
     */
    @Override
    public Kuackable CreateRedHeadDuck() {
        return new KuackableCounter(new RedHeadDuck());
    }
}

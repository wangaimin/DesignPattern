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
    public Quackable CreateMallardDuck() {
        return new QuackableCounter(new MallardDuck());
    }

    /**
     * 创建红头鸭
     *
     * @return
     */
    @Override
    public Quackable CreateRedHeadDuck() {
        return new QuackableCounter(new RedHeadDuck());
    }
}

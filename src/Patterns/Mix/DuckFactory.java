package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 14:54
 * description:没有装饰者的鸭子
 */
public class DuckFactory extends AbstractDuckFactory {
    /**
     * 创建绿头鸭
     *
     * @return
     */
    @Override
    public Kuackable CreateMallardDuck() {
        return new MallardDuck();
    }

    /**
     * 创建红头鸭
     *
     * @return
     */
    @Override
    public Kuackable CreateRedHeadDuck() {
        return new RedHeadDuck();
    }
}

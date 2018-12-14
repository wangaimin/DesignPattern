package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 14:52
 * description:抽象鸭子工厂，创建不同类型鸭子
 */
public abstract class AbstractDuckFactory {
    /**
     * 创建绿头鸭
     * @return
     */
    public abstract Kuackable CreateMallardDuck();

    /**
     * 创建红头鸭
     * @return
     */
    public abstract Kuackable CreateRedHeadDuck();
}

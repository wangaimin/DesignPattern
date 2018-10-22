package Patterns.StrategyPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/22 10:06
 * description:鸭子基类
 */
public abstract class Duck {
    FlyBefavior flyBefavior;

    /**
     * 鸭名
     */
    private String Name;

    /**
     * 外观
     */
    public abstract void DisPlay();

    /**
     * 腿数量
     */
    public void LegCount() {
        System.out.println("我有两条腿");
    }

    /**
     * 飞行
     */
    public void Fly() {
        flyBefavior.Fly();
    }

    /**
     * 发出声音
     */
    public void MackSound() {
        System.out.println("嘎嘎嘎");
    }

    /**
     * 动态改变行为
     *
     * @param flyBefavior
     */
    public void SetFlyBefavior(FlyBefavior flyBefavior) {
        this.flyBefavior = flyBefavior;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

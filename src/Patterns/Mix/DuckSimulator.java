package Patterns.Mix;

import jdk.nashorn.internal.runtime.Undefined;

import javax.lang.model.type.UnknownTypeException;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 9:50
 * description:鸭子模拟器
 */
public class DuckSimulator {

    public DuckSimulator() {

        //未使用抽象工厂之前
//        Kuackable mallardDuck = new KuackableCounter(new MallardDuck());
//        Kuackable redHeadDuck = new KuackableCounter(new RedHeadDuck());
//        Kuackable gooseDuckAdapter = new GooseToKuackableAdapter(new CountryGoose());
//        Simulator(mallardDuck);
//        Simulator(redHeadDuck);
//        Simulator(gooseDuckAdapter);
//        System.out.println("鸭子叫唤次数："+KuackableCounter.GetQuackCount());



        AbstractDuckFactory abstractDuckFactory=GetDuckFactory(0);
        AbstractDuckFactory abstractDuckFactory2=GetDuckFactory(1);

        Init(abstractDuckFactory);
        Init(abstractDuckFactory2);
    }

    public void Init(AbstractDuckFactory abstractDuckFactory){
        Kuackable gooseDuckAdapter = new GooseToKuackableAdapter(new CountryGoose());

        Simulator((abstractDuckFactory.CreateMallardDuck()));
        Simulator(abstractDuckFactory.CreateRedHeadDuck());
        Simulator(gooseDuckAdapter);
        System.out.println("鸭子叫唤次数："+KuackableCounter.GetQuackCount());
    }

    /**
     * 叫
     *
     * @param kuackable
     */
    public void Simulator(Kuackable kuackable) {
        kuackable.quack();

    }

    /**
     * 简单工厂模式获取鸭子工厂
     * @param type
     * @return
     */
    public AbstractDuckFactory GetDuckFactory(int type){
        if (type==0){
            return new DuckFactory();
        }else {
            return new CountingDuckFactory();
        }
    }
}

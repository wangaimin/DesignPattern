package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 9:50
 * description:鸭子模拟器
 */
public class DuckSimulator {

    public DuckSimulator() {

        //未使用抽象工厂之前
//        Quackable mallardDuck = new QuackableCounter(new MallardDuck());
//        Quackable redHeadDuck = new QuackableCounter(new RedHeadDuck());
//        Quackable gooseDuckAdapter = new GooseToQuackableAdapter(new CountryGoose());
//        Simulator(mallardDuck);
//        Simulator(redHeadDuck);
//        Simulator(gooseDuckAdapter);
//        System.out.println("鸭子叫唤次数："+QuackableCounter.GetQuackCount());


        AbstractDuckFactory abstractDuckFactory = GetDuckFactory(0);
        AbstractDuckFactory abstractDuckFactory2 = GetDuckFactory(1);

        Init(abstractDuckFactory);
        Init(abstractDuckFactory2);
    }

    public void Init(AbstractDuckFactory abstractDuckFactory) {
        Quackable gooseDuckAdapter = new GooseToQuackableAdapter(new CountryGoose());


        Quackable mallardDuck = abstractDuckFactory.CreateMallardDuck();
        Quackable redHeadDuck = abstractDuckFactory.CreateRedHeadDuck();


        //组合模式
        Flock flockDocks = new Flock();
        flockDocks.Add(mallardDuck);
        flockDocks.Add(redHeadDuck);

        //观察者模式
        Quackologist quackologist = new Quackologist();
        mallardDuck.registerObserver(quackologist);
        redHeadDuck.registerObserver(quackologist);
        gooseDuckAdapter.registerObserver(quackologist);
        //观察组合
        //flockDocks.registerObserver(quackologist);



        Simulator(flockDocks);

       /* Simulator(abstractDuckFactory.CreateMallardDuck());
        Simulator(abstractDuckFactory.CreateRedHeadDuck());*/
        Simulator(gooseDuckAdapter);
        System.out.println("鸭子叫唤次数：" + QuackableCounter.GetQuackCount());
    }

    /**
     * 叫
     *
     * @param quackable
     */
    public void Simulator(Quackable quackable) {
        quackable.quack();

    }

    /**
     * 简单工厂模式获取鸭子工厂
     *
     * @param type
     * @return
     */
    public AbstractDuckFactory GetDuckFactory(int type) {
        if (type == 0) {
            return new DuckFactory();
        } else {
            return new CountingDuckFactory();
        }
    }
}

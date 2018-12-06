
import Patterns.AdapterPattern.AdapterPatternTest;
import Patterns.CommandPattern.CommandPatternTest;
import Patterns.DecoratorPattern.DecoratorTest;
import Patterns.FacadePattern.FacadePatternTest;
import Patterns.FactoryMethodPattern.FactoryMethodPatternTest;
import Patterns.IteratorPattern.IteratorPatternTest;
import Patterns.ObserverPattern.ObserverTest;
import Patterns.SimpleFactoryPattern.DrinkTest;
import Patterns.SingletonPattern.SingletonTest;
import Patterns.StatePattern.TestStatePattern;
import Patterns.StrategyPattern.StrategyPatternTest;
import Patterns.TemplateMethodPattern.TemplateMethodPatternTest;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //策略模式
        StrategyPatternTest.Test();

        //观察者模式
        ObserverTest.Test();

        //装饰者模式
        DecoratorTest.Test();

        //简单工厂（静态工厂方法）
        DrinkTest.Test();

        //工厂方法
        FactoryMethodPatternTest.TestFactoryMethodPattern();

        //单例模式
        SingletonTest.SingletonClassTest();

        //命令模式
        CommandPatternTest.TestCommandPattern();

        //适配器模式
        AdapterPatternTest.TestAdapterPattern();

        //外观模式
        FacadePatternTest.Test();

        //模板方法模式
        TemplateMethodPatternTest.Test();

        //迭代器模式
        IteratorPatternTest.Test();

        //状态模式
        TestStatePattern.Test();

        CollectionTest();
    }

    /**
     * 集合测试
     */
    private static void CollectionTest() {

        //数据存储在char[]中，初始默认长度16
        StringBuilder stringBuilder= new StringBuilder();

        LinkedList<String> linkedList = new LinkedList<>();
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        hashMap.put("路飞", new ArrayList<String>() {{
            add("橡胶果实");
        }});
        hashMap.put("黑胡子", new ArrayList<String>() {{
            add("暗暗果实"); add("震震果实");}});

        hashMap.get("黑胡子");
    }

}



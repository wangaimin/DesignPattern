
import Patterns.DecoratorPattern.DecoratorTest;
import Patterns.FactoryMethodPattern.FactoryMethodPatternTest;
import Patterns.ObserverPattern.ObserverTest;
import Patterns.SimpleFactory.DrinkTest;
import Patterns.StrategyPattern.StrategyPatternTest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

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



        CollectionTest();
    }

    /**
     * 集合测试
     */
    private static void CollectionTest() {
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



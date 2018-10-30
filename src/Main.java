
import Patterns.ObserverPattern.Phone;
import Patterns.ObserverPattern.TV;
import Patterns.ObserverPattern.Weather;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //策略模式
        //StrategyPatternTest.Test();

        //观察者模式
        ObserverTest.Test();

        //装饰者模式
        DecoratorTest.Test();

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



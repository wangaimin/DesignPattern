package Patterns.StrategyPattern;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * author:'Gene.A.Wang'
 * date:2018/10/24 18:20
 * description:
 */
public class StrategyPatternTest {

    public  static  void Test(){

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.DisPlay();
        mallardDuck.Fly();
        mallardDuck.LegCount();
        mallardDuck.MackSound();


        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("ab");
        arrayList.add("abcd");
        arrayList.add("abc");
        // 创建类实现接口写法： arrayList.sort(new ComparatorString());

        // 直接new接口写法：
       /* arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()>o2.length()?1:o1.length()<o2.length()?-1:0;
            }
        });*/

        //写法三：Lambda表达式
        arrayList.sort((o1, o2) -> o1.length()>o2.length()?1:o1.length()<o2.length()?-1:0);

        for (String str:arrayList){
            System.out.println(str);
        }
    }

    public static  class  ComparatorString<String> implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.toString().length()>s2.toString().length()?1:s1.toString().length()<s2.toString().length()?-1:0;
        }

        @Override
        public Comparator reversed() {
            return null;
        }
    }

}

package Patterns.SingletonPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/9 14:55
 * description:
 */
public class SingletonTest {

    public static void SingletonClassTest() {
        SingletonClass.getInstance().ShowMsg("饿汉式单例模式");
        SingletonClass2.getInstance().ShowMsg("懒汉式单例模式");
        SingletonClass3.uniqueInstance.ShowMsg("枚举单例模式");
    }
}

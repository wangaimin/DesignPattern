package Patterns.SingletonPattern;

/**
 * 单例模式（饿汉式）
 * 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
 */
public class SingletonClass {
    private static SingletonClass ourInstance = new SingletonClass();

    public static SingletonClass getInstance() {
        return ourInstance;
    }

    private SingletonClass() {
    }

    public void ShowMsg(String msg){
        System.out.println(msg);
    }
}



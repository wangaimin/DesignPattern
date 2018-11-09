package Patterns.SingletonPattern;

/**
 * 单例模式(懒汉式，双重检查加锁)
 * 可以实现线程安全地创建实例，而又不会对性能造成太大的影响。它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
 */
public class SingletonClass2 {
    private volatile static SingletonClass2 ourInstance;

    public static SingletonClass2 getInstance() {
        if (ourInstance == null) {
            synchronized (SingletonClass2.class) {
                if (ourInstance == null) {
                    ourInstance = new SingletonClass2();
                }
            }
        }
        return ourInstance;
    }

    /**
     * 私有构造函数，防止被实例化
     */
    private SingletonClass2() {
    }

    public void ShowMsg(String msg){
        System.out.println(msg);
    }
}

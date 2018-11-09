package Patterns.SingletonPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/9 14:53
 * description:单例模式（枚举）
 * 使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
 */
public enum SingletonClass3 {
    uniqueInstance;

    public void ShowMsg(String msg){
        System.out.println(msg);
    }
}

package Patterns.CommandPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/21 14:56
 * description:没有命令
 */
public class NoCommand implements Command {
    @Override
    public void Executed() {
        System.out.println("没有命令");
    }
}

package Patterns.IteratorPattern.Menu;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/5 14:46
 * description:可乐
 */
public class Coke implements Menu {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String GetName() {
        return "可乐";
    }
}

package Patterns.IteratorPattern.Menu;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/5 14:43
 * description:汉堡
 */
public class Hamburger implements Menu {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String GetName() {
        return "汉堡";
    }
}

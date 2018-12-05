package Patterns.IteratorPattern;

import Patterns.IteratorPattern.Menu.Bar;
import Patterns.IteratorPattern.Menu.Coke;
import Patterns.IteratorPattern.Menu.Hamburger;
import Patterns.IteratorPattern.Menu.Menu;

import java.util.Iterator;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/5 11:42
 * description:早餐店
 */
public class BreakFastBar implements Bar {

    Menu[] menus;

    public BreakFastBar() {
        menus = new Menu[]{new Hamburger(), new Coke()};
    }

    @Override
    public Iterator GetIterator() {
        return new BreakFastBarIterator(menus);
    }
}

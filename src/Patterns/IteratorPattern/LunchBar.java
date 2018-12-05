package Patterns.IteratorPattern;

import Patterns.IteratorPattern.Menu.Bar;
import Patterns.IteratorPattern.Menu.Coke;
import Patterns.IteratorPattern.Menu.DoubleDookedPorkSlices;
import Patterns.IteratorPattern.Menu.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/5 14:01
 * description:午餐店
 */
public class LunchBar implements Bar {
    ArrayList<Menu> menus;

    public LunchBar() {
        this.menus =new ArrayList<>();
        this.menus.add(new Coke());
        this.menus.add(new DoubleDookedPorkSlices());
    }


    @Override
    public Iterator GetIterator() {
        return menus.iterator();
    }
}

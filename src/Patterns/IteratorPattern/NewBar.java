package Patterns.IteratorPattern;

import Patterns.IteratorPattern.Menu.Menu;

import java.util.Iterator;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/5 14:58
 * description:新餐馆
 */
public class NewBar {

    public void GetAllMenu(){

        LunchBar lunchBar=new LunchBar();
        BreakFastBar breakFastBar=new BreakFastBar();
        PrintMenu(lunchBar.GetIterator());
        PrintMenu(breakFastBar.GetIterator());

    }

    private void PrintMenu(Iterator iterator) {
        while(iterator.hasNext()){
            Menu menu=(Menu)iterator.next();
            System.out.println(menu.GetName());
        }
    }
}

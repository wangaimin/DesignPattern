package Patterns.IteratorPattern;

import Patterns.IteratorPattern.Menu.Menu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/5 15:11
 * description:
 */
public class BreakFastBarIterator implements Iterator {
    Menu[] menus;
    int count;
    int currentIndex=0;

    public BreakFastBarIterator(Menu[] menus) {
        this.menus = menus;
        count=this.menus.length;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        if(count>currentIndex) {
            return true;
        }
        return false;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Object next() {
        if(currentIndex>=count){
            throw new NoSuchElementException();
        }
        Object result=menus[currentIndex];
        currentIndex++;
        return result;
    }
}

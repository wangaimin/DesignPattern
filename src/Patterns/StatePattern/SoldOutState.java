package Patterns.StatePattern;

/**
 * @author:wangaimin
 * @date:2018/12/6 22:43
 * @description:已卖完状态
 */

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InsertCoins() {
        System.out.println("糖果已售完，不能投币");
    }

    @Override
    public void EjectCoins() {
        System.out.println("您没有投币");
    }

    @Override
    public void TurnCrank() {
        System.out.println("您没有投币");
    }

    @Override
    public void Dispense() {
        System.out.println("您没有投币");
    }
}

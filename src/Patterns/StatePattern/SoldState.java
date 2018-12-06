package Patterns.StatePattern;

/**
 * @author:wangaimin
 * @date:2018/12/6 22:42
 * @description:有货状态
 */

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InsertCoins() {
        System.out.println("请先取出糖果");
    }

    @Override
    public void EjectCoins() {
        System.out.println("您已经转动了曲柄");
    }

    @Override
    public void TurnCrank() {
        System.out.println("您已经转动了曲柄");
    }

    @Override
    public void Dispense() {
        gumballMachine.ReleaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoins());
        } else {
            System.out.println("糖果已售完");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

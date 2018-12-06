package Patterns.StatePattern;

/**
 * @author:wangaimin
 * @date:2018/12/6 23:33
 * @description:
 */

public class SupperStar implements State {
    GumballMachine gumballMachine;

    public SupperStar(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InsertCoins() {
        System.out.println("请先取出糖果");
    }

    @Override
    public void EjectCoins() {
        System.out.println("请先取出糖果");
    }

    @Override
    public void TurnCrank() {
        System.out.println("您已经转动了曲柄");
    }

    @Override
    public void Dispense() {
        gumballMachine.ReleaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.ReleaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoCoins());
            }
            else {
                System.out.println("糖果已售完");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        } else {
            System.out.println("糖果已售完");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

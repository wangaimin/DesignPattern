package Patterns.StatePattern;

/**
 * @author:wangaimin
 * @date:2018/12/6 22:44
 * @description:未投币
 */

public class NoCoins implements State {
    GumballMachine gumballMachine;

    public NoCoins(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InsertCoins() {
        System.out.println("投币成功");
        gumballMachine.setState(gumballMachine.hasCoins);
    }

    @Override
    public void EjectCoins() {
        System.out.println("您还未投币");
    }

    @Override
    public void TurnCrank() {
        System.out.println("您还未投币");
    }

    @Override
    public void Dispense() {
        System.out.println("您还未投币");
    }
}

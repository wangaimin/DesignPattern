package Patterns.StatePattern;

/**
 * @author:wangaimin
 * @date:2018/12/6 23:09
 * @description:
 */

public class TestStatePattern {
    public static void Test() {

        System.out.println();

        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.InsertCoins();
        gumballMachine.EjectCoins();

        gumballMachine.InsertCoins();
        gumballMachine.InsertCoins();
        gumballMachine.Dispense();
        gumballMachine.TurnCrank();
        gumballMachine.Dispense();

        gumballMachine.InsertCoins();
        gumballMachine.InsertCoins();
        gumballMachine.Dispense();
        gumballMachine.TurnCrank();
        gumballMachine.Dispense();

        gumballMachine.InsertCoins();
        gumballMachine.InsertCoins();
        gumballMachine.Dispense();
        gumballMachine.TurnCrank();
        gumballMachine.Dispense();
    }
}

package Patterns.StatePattern;

import java.util.Random;

/**
 * @author:wangaimin
 * @date:2018/12/6 22:45
 * @description:
 */

public class HasCoins implements State {
    GumballMachine gumballMachine;
    Random random=new Random(System.currentTimeMillis());

    public HasCoins(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InsertCoins() {
        System.out.println("不能重复投币");
    }

    @Override
    public void EjectCoins() {
        System.out.println("退投成功");
        gumballMachine.setState(gumballMachine.noCoins);
    }

    @Override
    public void TurnCrank() {
        System.out.println("您转动了曲柄");
        int winner=random.nextInt(10);
        if(winner==0&&gumballMachine.getCount()>1) {
            gumballMachine.setState(gumballMachine.getSupplierStar());
        }
        else {
            gumballMachine.setState(gumballMachine.soldState);
        }
    }

    @Override
    public void Dispense() {

    }
}

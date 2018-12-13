package Patterns.StatePattern;

/**
 * @author:wangaimin
 * @date:2018/12/6 22:46
 * @description:糖果售卖机
 *变量 缺省（无访问修饰符）可以被同一包中的所有的类访问，如果子类没有在同一个包中，也不能访问
 */

public class GumballMachine {
    State hasCoins;
    State noCoins;
    State soldState;
    State soldOutState;
    State supplierStar;
    int count;
    State state;

    public GumballMachine(int count) {
        this.hasCoins = new HasCoins(this);
        this.noCoins = new NoCoins(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.supplierStar=new SupperStar(this);
        this.count = count;
        this.state =this.noCoins;
    }

    /**
     * 投币
     */
    public void InsertCoins() {
        state.InsertCoins();
    }

    public void EjectCoins() {
        state.EjectCoins();
    }

    public void TurnCrank() {
        state.TurnCrank();
    }

    public void Dispense() {
        state.Dispense();
    }

   public void setState(State state) {
        this.state = state;
    }

    /**
     * 糖果减一
     */
    public void ReleaseBall(){
        if (count>0){
            System.out.println("您获得了糖果");
            count--;
        }
    }

    public State getHasCoins() {
        return hasCoins;
    }

    public void setHasCoins(State hasCoins) {
        this.hasCoins = hasCoins;
    }

    public State getNoCoins() {
        return noCoins;
    }

    public void setNoCoins(State noCoins) {
        this.noCoins = noCoins;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }
    public State getSupplierStar() {
        return supplierStar;
    }

    public void setSupplierStar(State supplierStar) {
        this.supplierStar = supplierStar;
    }
}

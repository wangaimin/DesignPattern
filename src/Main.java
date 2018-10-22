import Patterns.StrategyPattern.MallardDuck;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.DisPlay();
        mallardDuck.Fly();
        mallardDuck.LegCount();
        mallardDuck.MackSound();
    }
}

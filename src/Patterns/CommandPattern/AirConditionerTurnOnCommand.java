package Patterns.CommandPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/21 14:29
 * description:空调打开命令
 */
public class AirConditionerTurnOnCommand implements Command {
    AirConditioner airConditioner;
    public AirConditionerTurnOnCommand(AirConditioner airConditioner) {
        this.airConditioner=airConditioner;
    }

    @Override
    public void Executed() {
        airConditioner.TurnOn();
    }
}

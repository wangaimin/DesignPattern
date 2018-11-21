package Patterns.CommandPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/21 14:31
 * description:空调关闭命令
 */
public class AirConditionerTurnOffCommand implements Command {
    AirConditioner airConditioner;
    public AirConditionerTurnOffCommand(AirConditioner airConditioner) {
        this.airConditioner=airConditioner;
    }

    @Override
    public void Executed() {
        airConditioner.TurnOff();
    }
}

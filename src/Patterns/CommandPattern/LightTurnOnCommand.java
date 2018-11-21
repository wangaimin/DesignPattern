package Patterns.CommandPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/21 14:25
 * description:开灯命令
 */
public class LightTurnOnCommand implements Command {
    Light light;
    public LightTurnOnCommand(Light light) {
        this.light=light;
    }

    @Override
    public void Executed() {
        light.TurnOn();
    }
}

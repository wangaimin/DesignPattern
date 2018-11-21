package Patterns.CommandPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/21 14:26
 * description:关灯
 */
public class LightTurnOffCommand implements Command {
    Light light;
    public LightTurnOffCommand(Light light) {
        this.light=light;
    }

    @Override
    public void Executed() {
        light.TurnOff();
    }
}

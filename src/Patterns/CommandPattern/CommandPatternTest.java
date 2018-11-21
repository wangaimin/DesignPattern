package Patterns.CommandPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/21 15:04
 * description:
 */
public class CommandPatternTest {
    public static void TestCommandPattern() {

        LightTurnOnCommand lightTurnOnCommand = new LightTurnOnCommand(new Light());
        LightTurnOffCommand lightTurnOffCommand = new LightTurnOffCommand(new Light());
        AirConditionerTurnOnCommand airConditionerTurnOnCommand = new AirConditionerTurnOnCommand(new AirConditioner());
        AirConditionerTurnOffCommand airConditionerTurnOffCommand = new AirConditionerTurnOffCommand(new AirConditioner());

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.SetCommand(0, lightTurnOnCommand, lightTurnOffCommand);
        remoteControl.SetCommand(1, airConditionerTurnOnCommand, airConditionerTurnOffCommand);

        remoteControl.OnPress(0);
        remoteControl.OnPress(1);
        remoteControl.OffPress(0);
        remoteControl.OffPress(1);


        System.out.println();
    }
}

package Patterns.CommandPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/21 14:44
 * description:遥控器，上面有四个按钮。可以控制灯和空调的开关。
 */
public class RemoteControl {
   private Command[] onCommands;
   private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        //设置NoCommand可以不用判断有无命令
        for (int i = 0; i < 3; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void SetCommand(int i, Command onCommand, Command offCommand) {
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    public void OnPress(int i) {
        onCommands[i].Executed();
    }

    public void OffPress(int i) {
        offCommands[i].Executed();
    }
}

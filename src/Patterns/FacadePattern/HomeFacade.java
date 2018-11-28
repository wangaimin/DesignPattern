package Patterns.FacadePattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/28 11:33
 * description:家庭功能
 */
public class HomeFacade {

    private Light light;
    private Sound sound;
    private TV tv;

    public HomeFacade(Light light, Sound sound, TV tv) {
        this.light = light;
        this.sound = sound;
        this.tv = tv;
    }

    /**
     * 看电影
     */
    public void WatchMovie() {

        tv.TurnOn();
        sound.Open();
        light.TurnOff();
    }

    /**
     * 关闭电影
     */
    public void EndMovie() {
        light.TurnOn();
        tv.TurnOff();
        sound.Close();

    }
}

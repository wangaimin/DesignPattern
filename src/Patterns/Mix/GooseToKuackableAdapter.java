package Patterns.Mix;

/**
 * author:'Gene.A.Wang'
 * date:2018/12/14 10:03
 * description:把鹅转化为鸭子的适配器
 */
public class GooseToKuackableAdapter implements Kuackable {

    Goose goose;

    public GooseToKuackableAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.Honk();
    }
}

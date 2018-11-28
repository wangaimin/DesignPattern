package Patterns.AdapterPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/23 11:30
 * description:让两孔插头适配三孔
 */
public class PowerAdapter implements ThreeHole {
    TwoHole twoHole;

    public PowerAdapter(TwoHole twoHole) {
        this.twoHole = twoHole;
    }

    /**
     * 插孔
     */
    @Override
    public void Request() {
        twoHole.TwoHoleRequest();
    }
}

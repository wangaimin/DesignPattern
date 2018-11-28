package Patterns.TemplateMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/28 15:34
 * description:
 */
public class Tea extends Beverage {
    /**
     * 冲泡
     */
    @Override
    void Brew() {
        System.out.println("开始泡茶");
    }

    /**
     * 添加调料
     */
    @Override
    void AddCondiments() {
        System.out.println("添加柠檬");
    }


    @Override
    boolean IsAddCondiments() {
        return false;
    }

}

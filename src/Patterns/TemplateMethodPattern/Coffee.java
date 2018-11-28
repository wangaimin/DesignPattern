package Patterns.TemplateMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/28 15:36
 * description:
 */
public class Coffee extends Beverage {
    /**
     * 冲泡
     */
    @Override
    void Brew() {
        System.out.println("冲泡咖啡");
    }

    /**
     * 添加调料
     */
    @Override
    void AddCondiments() {
        System.out.println("添加糖");
    }
}

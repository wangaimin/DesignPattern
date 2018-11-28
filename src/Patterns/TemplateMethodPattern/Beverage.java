package Patterns.TemplateMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/28 15:28
 * description:饮料
 */
public abstract class Beverage {

    /**
     * 准备
     */
    final void Prepare(){

        BoilWater();
        Brew();
        PourInCup();
        if (IsAddCondiments()) {
            AddCondiments();
        }
    }

    final void BoilWater(){
        System.out.println("烧水");
    }

    /**
     * 冲泡
     */
    abstract void Brew();


    final void PourInCup(){
        System.out.println("导入杯中");
    }

    /**
     * 添加调料
     */
    abstract void AddCondiments();

    /**
     * 钩子(子类可选择是否重写)
     * 提供条件判断是否需要添加调料
     * @return
     */
    boolean IsAddCondiments(){
        return true;
    }
}

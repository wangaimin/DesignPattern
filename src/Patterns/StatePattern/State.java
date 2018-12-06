package Patterns.StatePattern;

/**
 * @author:wangaimin
 * @date:2018/12/6 22:37
 * @description:状态
 */

public interface State {

    /**
     * 投币
     */
    void InsertCoins();

    /**
     * 退币
     */
    void EjectCoins();

    /**
     * 转动曲柄
     */
    void TurnCrank();

    /**
     * 分配糖果
     */
    void Dispense();
}

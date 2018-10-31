package Patterns.SimpleFactory;

/**
 * @author:wangaimin
 * @date:2018/10/31 23:04
 * @description:
 */

public class DrinkTest {

    public static void Test() {
        Drink drink = Factory.GetDrink("Pepsi");
        drink.Print();
    }
}

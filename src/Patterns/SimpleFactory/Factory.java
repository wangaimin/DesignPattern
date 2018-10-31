package Patterns.SimpleFactory;

/**
 * @author:wangaimin
 * @date:2018/10/31 23:01
 * @description:饮料工厂
 */

public class Factory {
    public static Drink GetDrink(String type) {
        if (type == "CocaCola") {
            return new CocaColaDrink();
        } else if (type == "Pepsi") {
            return new PepsiDrink();
        }else{
            return null;
        }
    }
}

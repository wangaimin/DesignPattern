package Patterns.TemplateMethodPattern;

/**
 * author:'Gene.A.Wang'
 * date:2018/11/28 15:39
 * description:
 */
public class TemplateMethodPatternTest {
    public static void Test(){

        System.out.println();


        Tea tea=new Tea();
        tea.Prepare();

        new Coffee().Prepare();

    }
}



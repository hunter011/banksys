/**
 * Created by   Intellif Idea 2019.08
 * Author:  Wang Yun
 * Date:    2019-08-13
 * Time:    21:54
 */
public class Test {

    @org.junit.Test
    public static void main(String[] args) {
    }

    public void stringBuilderTest(int end) {
        char[] foo = new char[]{'@', 'a', '*'};
        char ch;
        int x = 0;
        while ((ch = foo[++x]) != '*') {
            System.out.println("" + x + ": " + ch);
        }
    }
}

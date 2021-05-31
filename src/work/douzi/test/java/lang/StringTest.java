package work.douzi.test.java.lang;

/**
 * @author Ryan
 * @date 2021/5/31
 */
public class StringTest {

    public static void main(String[] args) {

        String string = new String("abc");
        string = string + "123";

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("123");

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("123");

    }

}

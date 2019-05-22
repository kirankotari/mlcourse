package garbage_test;
import java.util.Formatter;
import java.util.regex.*;

public class RefString {

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("a+y");
        Matcher m1 = p1.matcher("aaay");
        boolean b = m1.matches();
        System.out.println(b);
    }

}


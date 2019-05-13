import java.lang.reflect.Method;
import java.lang.annotation.*;

public class Request {
    @RequestForCustomer(level = 2,
            description = "Enable time",
            date = "10/10/2007")
    public void customerThroughTime() {
        try {
            Class c = this.getClass();
            Method m = c.getMethod("customerThroughTime");
            RequestForCustomer ann = m.getAnnotation(RequestForCustomer.class);
            System.out.println(ann.level() + " " + ann.description() + " " + ann.date());
        } catch (NoSuchMethodException e) {
            System.out.println("метод не найден");
        }
    }
    public static void main(String[] args) {
        Request ob = new Request();
        ob.customerThroughTime();
    }
}

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)

public @interface RequestForCustomer {
    int level();

    String description();

    String date();
}
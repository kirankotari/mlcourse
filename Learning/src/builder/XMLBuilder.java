package builder;

public class XMLBuilder extends BaseBuilder {
    public void buildLogin() {
        user.setLogin("Admin");
    }
    public void buildPassword() {
        user.setPassword("Qu");
    }
}


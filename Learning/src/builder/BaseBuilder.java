package builder;

public abstract class BaseBuilder {
    protected User user = new User();

    public User getUser() {
        return user;
    }

    public abstract void buildLogin();
    public abstract void buildPassword();
}


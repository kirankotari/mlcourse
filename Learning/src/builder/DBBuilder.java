package builder;

public class DBBuilder extends XMLBuilder {

    public void buildLogin() {
        user.setLogin("Moderator");
    }
    public void buildPassword() {
        user.setPassword("Ku");
    }
}

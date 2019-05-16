package builder;

public class Main {

    private static User buildUser(BaseBuilder builder) {
        builder.buildLogin();
        builder.buildPassword();
        return builder.getUser();
    }

    public static void main(String[] args) {
        User e1 = buildUser(new XMLBuilder());
        User e2 = buildUser(new DBBuilder());
        System.out.println(e1.getLogin());
        System.out.println(e1.getPassword());
        System.out.println(e2.getLogin());
        System.out.println(e2.getPassword());
    }
}

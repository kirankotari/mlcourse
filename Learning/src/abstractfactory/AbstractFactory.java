package abstractfactory;

public class AbstractFactory {
    enum Color { BLACK, WHITE };
    public static BaseFactory getFactory(String data) {
        Color my = Color.valueOf(data.toUpperCase());
        switch(my) {
            case BLACK : return new BlackFactory();
            case WHITE : return new WhiteFactory();
            default : throw new EnumConstantNotPresentException(Color.class, my.name());
        }
    }
}

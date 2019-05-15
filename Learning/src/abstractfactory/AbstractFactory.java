package abstractfactory;

public class AbstractFactory {
    enum Cclor { BLACK, WHITE };
    public static BaseFactory getFactory(String data) {
        Color my = Color.valueOf(data.toUpperCase());
        switch(my) {
            case BLACK : return new BlackFactory();
            case WHITE : return new WhiteFactory();
            default: : throw new EnumConstantNotPresentException(Signs.class, sign.name());
        }
    }
}

package bridge;
import implementor.*;
import abstraction.*;

public class Main {
    public static void main(String[] args) {
        YellowColor color = new YellowColor();
        new Rectangle(color).performWithColor();
        new Circle(color).performWithColor();
    }
}

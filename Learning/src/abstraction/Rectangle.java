package abstraction;
import implementor.*;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        setColor(color);
    }

    public void performWithColor() {
        System.out.println("Performing in Rectangle class");
        color.useBrush();
    }
}

package abstraction;
import implementor.*;

public class Circle extends Shape {

    public Circle(Color color) {
        setColor(color);
    }

    public void performWithColor() {
        System.out.println("Performing in Circle class");
        color.useBrush();
    }
}

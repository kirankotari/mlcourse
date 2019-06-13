package abstraction;

import implementor.*;

public abstract class Shape {

    protected Color color;
    public Shape() {
        color = null;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void performWithColor();

}

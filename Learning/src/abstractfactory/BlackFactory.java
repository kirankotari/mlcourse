package abstractfactory;

public class BlackFactory extends BaseFactory {
    public Circle createCircle(double radius) {
        return new BlackCircle(radius);
    }
    public Triangle createTriangle(double a, double b) {
        return new BlackTriangle(a,b);
    }
}

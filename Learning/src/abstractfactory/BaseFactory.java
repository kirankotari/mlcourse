package abstractfactory;

public abstract class BaseFactory {
    public abstract Circle createCircle(double radius);
    public abstract Triangle createTriangle(double a, double b);
}

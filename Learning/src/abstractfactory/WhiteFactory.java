package abstractfactory;

public class WhiteFactory extends BaseFactory {
    public Circle createCircle(double radius) {
        return new WhiteCircle(radius);
    }
    public Triangle createTriangle(double a, double b){
        return new WhiteTriangle(a, b);
    }

}

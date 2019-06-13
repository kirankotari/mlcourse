package abstractfactory;

public class BlackCircle extends Circle {
    public BlackCircle(double radius) {
        this.radius = radius;
        color = "Black";
    }
    public void square() {
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println(color + " Circle" + " Square = " + s);
    }
}

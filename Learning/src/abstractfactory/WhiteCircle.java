package abstractfactory;

public class WhiteCircle extends Circle{

    public WhiteCircle(double radius){
        this.radius = radius;
        color = "White";
    }
    public void square(){
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println(color + " Circle " + "Square = " + s);
    }
}

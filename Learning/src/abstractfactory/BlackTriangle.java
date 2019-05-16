package abstractfactory;

public class BlackTriangle extends Triangle {
    public BlackTriangle (double a, double b){
        this.a = a;
        this.b = b;
        color = "Black";
    }
    public void square() {
        double s = a * b / 2;
        System.out.println(color + " Triangle" + " Square = " + s);
    }
}

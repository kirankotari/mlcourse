package abstractfactory;

public class WhiteTriangle extends Triangle {
    public WhiteTriangle (double a,double b) {
        this.a = a;
        this.b = b;
        color = "White";
    }
    public void square(){
        double s = 0.5 * a * b;
        System.out.println(color + " Triangle" + " Square = " + s);
    }
}

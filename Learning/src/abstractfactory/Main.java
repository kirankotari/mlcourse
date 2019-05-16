package abstractfactory;

public class Main {
    public static void main(String[] args) {
        BaseFactory factory1 =
                AbstractFactory.getFactory("black");
        BaseFactory factory2 =
                AbstractFactory.getFactory("white");
        Circle ob1 = factory1.createCircle(1.232);
        Circle ob2 = factory2.createCircle(1);
        Triangle ob3 = factory1.createTriangle(12, 5);
        Triangle ob4 = factory2.createTriangle(1, 7);

        ob1.square();
        ob2.square();
        ob3.square();
        ob4.square();
    }
}

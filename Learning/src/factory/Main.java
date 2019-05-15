package factory;

public class Main {
    public static void main(String[] args) {
        Base ob1 = ClassFactory.getClassFromFactory("first");
        Base ob2 = ClassFactory.getClassFromFactory("second");
        ob1.perform();
        ob2.perform();
    }
}

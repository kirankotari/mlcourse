package decorator;

public class BusDriver extends DriverDecorator {
    public BusDriver(Driver driver) {
        super(driver);
    }
    public void do() {
        driver.do();
    }

    private void addedBehaviorOne() {
        System.out.println("I am bus driver");
    }
    public void do() {
        driver.do();
        addedBehaviorOne();
    }
}

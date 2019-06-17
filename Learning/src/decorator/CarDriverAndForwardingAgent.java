package decorator;

public class CarDriverAndForwardingAgent extends DriverDecorator {
    public CarDriverAndForwardingAgent(Driver driver) {
        super(driver);
    }
    private void addedBehaviorTwo() {
        System.out.println("I am forwarding Agent");
    }
    public void doing() {
        driver.doing();
        addedBehaviorTwo();
    }
}

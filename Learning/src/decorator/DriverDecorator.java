package decorator;

public abstract class DriverDecorator {
    protected Driver driver;

    public DriverDecorator(Driver driver) {
        this.driver = driver;
    }
    public void do() {
        driver.do();
    }
}

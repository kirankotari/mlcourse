package decorator;

public class Main {

    public static void main(String args[]){
        Driver carDriver = new CarDriver();
        Main runner = new Main();
        runner.doDrive(carDriver);
        runner.doDrive(new BusDriver(carDriver));
        runner.doDrive(new CarDriverAndForwardingAgent(carDriver));
    }

    public void doDrive(Driver driver){
        driver.do();
    }

}

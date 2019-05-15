import java.util.ArrayList;

public class Car extends Vehicle {

    private SteeringWheel stWheel;
    private ArrayList<Wheel> wheelsList;
    private boolean isMove = false;
    private int fillUp;
    private String model;

    Car(String model, ArrayList<Wheel> wheelsList) {
        stWheel = new SteeringWheel();
        this.model = model;
        this.wheelsList = wheelsList;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public void move() {
        this.isMove = true;
        System.out.println("Car is on way");
    }

    @Override
    public void fillUp(int fuel) {
        if(!isMove) {
            this.fillUp = fuel;
            System.out.println("Auto filled up on" + fuel);
        } else {
            System.out.println("Stop " + getModel());
        }
    }

    public void RepaitWheel(int numWheel) {
        if (!isMove) {
            System.out.println("Wheel number " + numWheel + "repaired");
        } else {
            System.out.println("Stop " + getModel());
        }
    }
}

class CarRunner {
    public static void main(String[] args) {
        String model = "mazda";
        ArrayList<Wheel> wheelsList = new ArrayList<>();
        Car mazda = new Car(model, wheelsList);
        mazda.fillUp(19);
        mazda.RepaitWheel(2);
        System.out.println(mazda);
    }
}

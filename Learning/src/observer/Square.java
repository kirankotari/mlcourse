package observer;

public class Square extends OperationObserver {

    private float square;

    public float valueChanged(Rectangle observed) {

        return square = observed.getWidth() * observed.getHeight();

    }
    public String toString() {

        return "S = " + square;

    }

}

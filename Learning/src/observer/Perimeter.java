package observer;

public class Perimeter extends OperationObserver {

    private float perimeter;

    public float valueChanged(Rectangle observed) {

        return perimeter = 2 * (observed.getWidth() + observed.getHeight());

    }
    public String toString() {

        return "P = " + perimeter;

    }
}

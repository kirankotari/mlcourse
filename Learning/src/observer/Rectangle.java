package observer;
import java.util.ArrayList;
import java.util.Iterator;

public class Rectangle {

    private float width;
    private float height;
    private ArrayList<OperationObserver> observerList = new ArrayList<OperationObserver>();

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void addObserver(OperationObserver observer) {
        observerList.add(observer);
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setWidth(float width) {
        this.width = width;
        notifyObservers();
    }

    public void setHeight(float height) {
        this.height = height;
        notifyObservers();
    }

    private void notifyObservers() {
        Iterator it = observerList.iterator();
        while (it.hasNext()) {
            ((OperationObserver) it.next()).valueChanged(this);
        }
    }

    public String toString() {
        String s = "";
        Iterator it = observerList.iterator();
        while (it.hasNext()) {
            s = s + ((OperationObserver) it.next()).toString() + '\n';
        }
        return s;
    }
}

package db_test;
import java.io.*;

public abstract class Entity implements Serializable, Cloneable {
    public int id;

    public Entity() {
    }
    public Entity(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
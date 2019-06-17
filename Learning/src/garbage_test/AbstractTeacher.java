package garbage_test;

public abstract class AbstractTeacher {

    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    public abstract boolean excludeStudent(String name);

}

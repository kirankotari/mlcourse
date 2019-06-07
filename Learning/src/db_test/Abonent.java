package db_test;

public class Abonent extends Entity {
    private String first_name;
    private String lastname;

    public Abonent() {
    }
    public Abonent(int id, String first_name, String lastname) {
        super(id);
        this.first_name = first_name;
        this.lastname = lastname;
    }
    public String getFirstName() {

        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String toString() {
        return "Abonent [id=" + id + ", first_name=" + first_name +
                ", lastname=" + lastname + "]";
    }
}
package garbage_test;

public class TeacherLogic {
    public static void excludeProcess(int deanId, String name) {

        AbstractTeacher teacher = new TeacherCreator().createTeacher(deanId);
        System.out.println("Студент: " + name + " отчислен:" + teacher.excludeStudent(name));

    }
    public static void main(String[] args) {
        excludeProcess(700, "Балаганов");
        excludeProcess(777, "Балаганов");
    }
}

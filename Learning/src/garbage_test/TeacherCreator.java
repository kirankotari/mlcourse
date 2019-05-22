package garbage_test;

public class TeacherCreator {

    public TeacherCreator(){}

    public AbstractTeacher createTeacher(int id) {

        class Dean extends AbstractTeacher {
            Dean(int id){
                super(id);
            }
            public boolean excludeStudent(String name) {
                if (name != null) {
                    return true;
                }
                else return false;
            }
        }// конец внутреннего класса
        if (isDeanId(id))
            return new Dean(id);
        else return new Teacher(id);
    }

    private static boolean isDeanId(int id) {
        return (id == 777);
    }
}
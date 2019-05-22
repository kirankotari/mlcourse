package garbage_test;

public class AnySession {
    public static void main(String[] args) {
        Student stud = new Student(822201);
        String ex[] = {"Meханика","Программирование"};
        int marks[] = { 2, 9 };
        stud.setExams(ex, marks);
        System.out.println(stud);
    }
}

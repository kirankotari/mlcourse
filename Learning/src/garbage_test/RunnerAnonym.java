package garbage_test;

public class RunnerAnonym {
    public static void main(String[] args) {
        TypeQuest unique = new TypeQuest() {
            public void addNewType() {
                System.out.println("Add question with free answer");
            }
        };
        unique.addNewType();

        new TypeQuest(71) {
            private String name = "Drag?Drop";
            public void addNewType() {
                System.out.println("add " + getName());
            }
            String getName() {
                return name;
            }
        }.addNewType();

    }
}

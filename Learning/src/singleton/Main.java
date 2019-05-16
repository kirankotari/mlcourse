package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        singleton.getInstance();
        System.out.println(singleton);
    }
}


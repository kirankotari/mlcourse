package singleton;

public class Singleton {

    private static Singleton instance = null;

   /* private SingletonTrust() {}*/

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creating singleton");
            instance = new Singleton();
        }
        return instance;
    }
}

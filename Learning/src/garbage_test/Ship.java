package garbage_test;

public class Ship {
    public class Engine {
        public void launch() {
            System.out.println("Запуск двигателя");
        }
    }
    public void init() {
        Engine eng = new Engine();
        eng.launch();
    }
}

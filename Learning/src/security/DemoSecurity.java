package security;

public class DemoSecurity {
    public static void main(String[] args) {
        CheckRight.startUsing(2041, "Artsiom");
        CheckRight.startUsing(2420, "Yaroslav");
        CheckRight.startUsing(2437, "Anastasiya");
        CheckRight.startUsing(2041,"Artsiom");
        CheckRight.startUsing(212341,"Artsiomdasdsas");
    }
}

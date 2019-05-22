package command.receiver;

public class ArrayOperation {
    private int[] mass;

    public ArrayOperation(int[] mass) {
        this.mass = mass;
    }
    public void sum() {
        int sum = 0;
        for(int i : mass)
            sum += i;
        System.out.println(sum);
    }
    public void product() {
        int mult = 1;
        for (int i : mass)
            mult *= i;
        System.out.println(mult);
    }
}

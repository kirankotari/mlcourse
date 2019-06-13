package strategy;

public class Sorting  {
    private Operation operation = null;
    public Sorting(int operation) {
        switch(operation) {
            case 1: this.operation = new SortByMax();
//            case 2: this.operation = new SortByMin();
                break;
                default: System.out.println("This operation is absent");
        }

    }
    public void sorting(int[] mass) {
        if (operation != null) operation.sort(mass);
        else return;
    }

}

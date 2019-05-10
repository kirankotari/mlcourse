import java.io.*;

public class ReadCharRunner {
    private int[][] a;

    public ReadCharRunner(int n, int m) {
        a = new int[n][m];
    }
    public int getVerticalSize() {
        return a.length;
    }
    public int getHorizontalSize() {
        return a[0].length;
    }
    public int getElement(int i, int j) {
        return a[i][j];
    }
    public void setElement(int i, int j, int value) {
        a[i][j] = value;
    }
    public String toString() {
        String s = "\nMatrix : " + a.length + "x" + a[0].length + "\n";

        for(int[] vector: a) {
            for (int value : vector)
                s += value + "";
            s += "\n";
        }
        return s;
    }
    class MatrixFactory {
        public static ReadCharRunner createRandomized(int  n, int m) {
            ReadCharRunner chara = new ReadCharRunner(n,m);
            for(int i = 0; i<n; i++) {
                for (int j =  0;j<m;j++) {
                    chara.setElement(i, j, (int)(Math.random()*m*m));
                }
            }
            return chara;
        }
    }
    class Multiplicator {
        public ReadCharRunner multiply(ReadCharRunner p, ReadCharRunner q)
                throws MultipleException {
            int v = p.getVerticalSize();
            int h = q.getHorizontalSize();
            int temp = p.getHorizontalSize();

            if (temp != q.getVerticalSize())
                throw new MultipleException();

            ReadCharRunner  result = new Matrix(v, h);

            for (int i = 0; i < v; i++)
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < temp; k++) {
                        value += p.getElement(i, k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            return result;
        }
    }
    public static void main(String []args){
        ReadCharRunner runner = new ReadCharRunner(22,23);
        Multiplicator multi = new Multiplicator();
        MatrixFactory matrix = new MatrixFactory();

        runner.getElement(2,3);
        runner.setElement(0,1,5);
        multi.multiply(2,3);
        System.out.println(runner.getElement(0,1));
    }
}

package lab;
import java.io.*;
import java.util.*;

public class labTwo {
    public static void main(String[] args) {
        final Stack<Integer> st = new Stack<Integer>();
        final Scanner scan = new Scanner(System.in);
        int stackInt = scan.nextInt();
        while(scan.hasNextInt())
            st.push(scan.nextInt());

        while (!(st.isEmpty()))
            System.out.println(st.pop());
    }
}

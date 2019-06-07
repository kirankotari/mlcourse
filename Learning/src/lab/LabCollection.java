package lab;
import java.io.*;
import java.util.*;

public class LabCollection {
    public static void main(String[] args) throws FileNotFoundException {
        LabCollection lab = new LabCollection();
        Scanner in = new Scanner(new File("C:\\Users\\Aliaksandr_Taranishy\\Desktop\\mlcourse.ai\\Learning\\src\\lab\\text.txt"));
        Stack<String> text = new Stack<String>();
        while (in.hasNextLine()) {
            text.push(in.nextLine());
        }
        System.out.println(text);
        while(!text.empty()) {
            System.out.println(text.pop());
        }
    }
}

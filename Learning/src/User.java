import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class User {
    public static void main(String[] args) {}
        public void task1() {
            int n_string;
            String[] text;
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                n_string = Integer.parseInt(scan.nextLine());
                int indexMax = 0;
                int indexMin = 0;
                text = new String[n_string];

                for (int i = 0; i < n_string; i++) {
                    text[i] = scan.nextLine();
                    if (text[i].length() <= text[indexMin].length())
                        indexMin = i;
                    if (text[i].length() >= text[indexMax].length())
                        indexMax = i;
                }
                System.out.printf("MIN (%d): \"%s\"%n", text[indexMin].length (), text[indexMin]);
                System.out.printf("MAX (%d): \"%s\"%n", text[indexMax].length (), text[indexMax]);
            }
        }
    }



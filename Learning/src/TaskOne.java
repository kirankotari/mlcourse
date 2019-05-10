import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collection;

/*public class TaskOne {
    public static void main(String[] args) {
        int string_number;
        String[] text;
        try {
            Scanner scan = new Scanner(System.in);
            if (!scan.hasNextInt()) throw new InputMismatchException();
            string_number = Integer.parseInt(scan.nextLine());
            int index_max = 0;
            int index_min = 0;
            text = new String[string_number];
            
            for(int i=0;i<string_number;i++) {
                text[i] = scan.nextLine();
                if(text[i].length()<=text[index_min].length())
                    index_min=i;
                        
                if(text[i].length()>=text[index_max].length()) 
                    index_max=i; 
            }
            
            System.out.printf("MIN (%d): \"%s\"%n", text[index_min].length(), text[index_min]);
            String string = "MAX (%d): \"%s\"%n";
            System.out.printf(string, text[index_max].length(), text[index_max]);
        } 
        catch (InputMismatchException e) {
            System.out.println("Not a number");
        }  
    }
}*/
class TaskOne {
    public static void main(String[] args) {
        int string_number;
        String[] words;
        String text;
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            string_number = Integer.parseInt(scan.nextLine());
            text = scan.nextLine();
            words = text.split("", string_number);

            String wordMinCharVar = words[0];
            int sizeMinCharVar = new HashSet<String>(Arrays.asList(words[0].split(""))).size();
            for(String word: words) {
                Set<String> set = new HashSet<String>(Arrays.asList(word.split("")));
                if(set.size() < sizeMinCharVar) {
                    wordMinCharVar = word;
                    sizeMinCharVar = set.size();
                }
            }
            System.out.println(wordMinCharVar);
        }
    }
}
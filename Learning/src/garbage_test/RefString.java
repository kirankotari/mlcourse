package garbage_test;

import java.io.FileReader;
import java.io.*;

public class RefString {

    public static void main(String[] args) {
        String pArray[] = { "2007 ", "Java SE 6" };
        File fbyte = new File("C:\\Users\\Aliaksandr_Taranishy\\Desktop\\mlcourse.ai\\Learning\\src\\garbage_test\\byte.txt");
        File fsymb = new File("C:\\Users\\Aliaksandr_Taranishy\\Desktop\\mlcourse.ai\\Learning\\src\\garbage_test\\symbol.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fbyte);
            FileWriter fw = new FileWriter(fsymb);
            for (String a : pArray) {
                fos.write(a.getBytes());
                fw.write(a);
            }
            fos.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }
    }


}


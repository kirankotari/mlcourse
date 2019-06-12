package net_test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;


public class Main2 {

    public static void main(String[] args) {
        File currentDir = new File("C:\\Users\\Aliaksandr_Taranishy\\Desktop\\mlcourse.ai\\Learning"); // current directory
        displayDirectoryContents(currentDir);
    }

    public static void displayDirectoryContents(File dir) {
        try {
            File[] files = dir.listFiles();
            try {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getCanonicalPath());
                        displayDirectoryContents(file);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
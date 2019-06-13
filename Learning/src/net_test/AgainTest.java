package net_test;

import java.io.File;
import java.sql.*;

public class AgainTest {

    public static void main(String[] args) {
        File currentDir = new File("C:\\Users\\Aliaksandr_Taranishy\\Desktop\\mlcourse.ai\\Learning");
        if (currentDir != null) {
            displayDirectoryContents(currentDir);
        }
    }

    public static void displayDirectoryContents(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
                try {
                    if (file.isDirectory()) {

                           displayDirectoryContents(file);
                            Connection cn = ConnectorDB.getConnection();
                            String query = "INSERT INTO filesystem(dirname)" + " VALUES(?)";
                            PreparedStatement pr = cn.prepareStatement(query);
                            pr.setString(1, file.getName());
                            pr.execute();
                    }
                } catch (SQLException e) {
                    e.getMessage();

                } catch (Exception ignore) {
                continue;
            }
        }
    }
}







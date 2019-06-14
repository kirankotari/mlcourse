package net_test;

import java.io.File;
import java.sql.*;

public class AgainTest {

    public static void main(String[] args) {
        int id_root = 0;
        File currentDir = new File("C:/Program Files");
        if (currentDir != null) {
            displayDirectoryContents(currentDir,id_root);
        }
    }

    public static void displayDirectoryContents(File dir, int id) {

        try {
            if (dir.isDirectory()) {

                Connection cn = ConnectorDB.getConnection();
                String query = "INSERT INTO filesystem(dirname,parent_id)" + " VALUES(?,?)";
                PreparedStatement pr = cn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                pr.setString(1, dir.getName());
                pr.setInt(2,id);
                pr.execute();
                cn.close();
                ResultSet rs = pr.getGeneratedKeys();
                if (rs.next()) {
                    id = rs.getInt(1);
                    if(id==0) {
                        pr.setInt(2,0);
                    }
                }
            }

        } catch (SQLException e) {
            e.getMessage();
        }

        File[] files = dir.listFiles();
        if (files != null) {

            for (File file : files) {

                displayDirectoryContents(file,id);
            }
        }
    }

}








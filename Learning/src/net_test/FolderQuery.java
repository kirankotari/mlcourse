package net_test;

import java.io.File;
import java.sql.*;
import net_test.ConnectorDB;

public class FolderQuery {
    public static void main(String[] args) {
        int id_root = 0;
        File currentDir = new File("C:\\Users\\Aliaksandr_Taranishy\\Desktop\\mlcourse.ai\\Learning");
        AgainTest push = new AgainTest();
        if (currentDir.isDirectory()) {
            displayDirectoryContents(currentDir, id_root);
        }
    }
        public static void displayDirectoryContents(File dir, int id) {

            try {
                Connection cn = ConnectorDB.getConnection();
                if (dir.isDirectory()) {

                    String query = "INSERT INTO folder(foldername,parent_id)" + " VALUES(?,?)";
                    PreparedStatement pr = cn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

                    pr.setString(1, dir.getName());
                    pr.setInt(2, id);
                    pr.execute();

                    ResultSet rs = pr.getGeneratedKeys();
                    if (rs.next()) {
                        id = rs.getInt(1);
                    }
                    if (id < 0) {
                        pr.setInt(2, id);
                    }
                }
                else if(dir.isFile()){

                    String query1 = "INSERT INTO file(filename,folder_id)" + " VALUES(?,?)";
                    PreparedStatement pq = cn.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);
                    pq.setString(1,dir.getName());
                    pq.setInt(2, id);
                    pq.execute();

                    ResultSet rq = pq.getGeneratedKeys();

                    if (rq.next()) {
                        id = rq.getInt(1);
                    }
                }
            } catch (SQLException e) {
                e.getMessage();
            }

            File[] files = dir.listFiles();
            if (files != null) {

                for (File file : files) {
                    displayDirectoryContents(file, id);
                }
            }
        }
}
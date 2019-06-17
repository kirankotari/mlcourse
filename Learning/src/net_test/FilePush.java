package net_test;
import net_test.ConnectorDB;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.io.File;

public class FilePush {

    public void walk(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk(f.getAbsolutePath());
            }
            else {
                try{
                    Connection cn = ConnectorDB.getConnection();
                    String query = "INSERT INTO files(dirname)" + " VALUES(?)";
                    PreparedStatement pr = cn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                    ResultSet result = pr.getGeneratedKeys();
                    if(result.next()) {

                    }
                    pr.setString(1, f.getName());
//                    pr.setInt(2,id);pr.setInt(2,id);pr.setInt(2,id);
                    pr.execute();
//                    System.out.println( f.getName() );
                } catch(SQLException e) {
                    e.printStackTrace();
            }
            }
        }
    }

    public static void main(String[] args) {
        FilePush fw = new FilePush();
        fw.walk("C:\\Users\\Aliaksandr_Taranishy\\Desktop\\mlcourse.ai\\Learning" );
    }

}
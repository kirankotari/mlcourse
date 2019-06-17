package net_test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net_test.ConnectorDB;
import java.sql.*;
import java.util.regex.Pattern;

public class GFG {
    public static void main(String[] args) throws IOException {

        File f = new File("C:/Python 2.5/"); // current directory

        FileFilter directoryFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };

        File[] files = f.listFiles(directoryFilter);

        for (File file : files) {
            String separator = "\\";
            String[] splitter = file.toString().split(Pattern.quote(separator));
            String secPart = splitter[2];
            System.out.println(secPart);
            try {
                Connection cn = ConnectorDB.getConnection();
                String selectTable = "SELECT * FROM filesystem";
                String  nylle = "NOT NULL";
                String TYPE = "VARCHAR(100)";
                String query = "INSERT INTO filesystem(dirname)" + " VALUES(?)";
                System.out.println(query);
//                Statement statement = cn.createStatement();
                PreparedStatement pr = cn.prepareStatement(query);

                pr.setString(1,secPart);


                pr.execute();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
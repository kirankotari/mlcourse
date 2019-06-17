//package net_test;
//import java.io.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class MainListFiles {
//    public static void main(String[] args) {
//             String sqlDir;
//             String pathes;
//            File folder = new File("C:/");
//
//            String[] files = folder.list();
//
//            for (String file : files) {
//                sqlDir = file;
//                String[] folderOfFolder;
//                String type = sqlDir.getClass().getName();
//                System.out.println(type);
//                sqlDir.li
//                try {
//                    String selectTableSql = "SELECT * from subcatalog";
//                    String query = " insert into subcatalog (folder)" + "values(?)";
//                    Statement statement = null;
//                    Connection cn = ConnectorDB.getConnection();
//                    PreparedStatement pr = cn.prepareStatement(query);
//                    pr.setString(1,sqlDir);
//                    pr.execute();
//                    cn.close();
//                } catch(SQLException e) {
//                    e.printStackTrace();
//                }
//                for(String qwer file) {
//
//                }
//            }
//}}
